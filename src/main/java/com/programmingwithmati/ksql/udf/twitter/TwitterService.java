package com.programmingwithmati.ksql.udf.twitter;

import java.util.List;

public interface TwitterService {

  List<Tweet> getRelevantTweets(String playerName);
}
