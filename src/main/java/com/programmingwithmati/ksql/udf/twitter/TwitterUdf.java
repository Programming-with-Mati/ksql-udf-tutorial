package com.programmingwithmati.ksql.udf.twitter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.confluent.ksql.function.udf.Udf;
import io.confluent.ksql.function.udf.UdfDescription;
import io.confluent.ksql.function.udf.UdfParameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@UdfDescription(
        name = "get_relevant_tweets",
        description = "Looks for relevant tweet about the player",
        version = "0.2.0",
        author = "Matias Salerno"
)
public class TwitterUdf {

  public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
  public static final Logger LOGGER = LoggerFactory.getLogger(TwitterUdf.class);
  private final TwitterService twitterService = new DummyTwitterService();

  @Udf(description = "Looks for relevant tweet about the player")
  public String apply(@UdfParameter(value = "playerName", description = "The name of the player to retrieve tweets") String playerName) {
    try {
      return OBJECT_MAPPER.writeValueAsString(twitterService.getRelevantTweets(playerName));
    } catch (JsonProcessingException e) {
      LOGGER.error("ERROR retrieving tweets.", e);
      return String.format("{\"error\": \"Error retrieving tweets. %s\"}", e.getMessage());
    }
  }

}
