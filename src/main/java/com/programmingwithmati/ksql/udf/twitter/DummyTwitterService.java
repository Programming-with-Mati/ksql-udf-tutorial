package com.programmingwithmati.ksql.udf.twitter;

import java.util.List;

public class DummyTwitterService implements TwitterService {
  @Override
  public List<Tweet> getRelevantTweets(String playerName) {
    switch (playerName) {
      case "Lionel Messi":
        return getMessiTweets();
      case "Cristiano Ronaldo":
        return getRonaldoTweets();
      default:
        return getRandomPlayerTweets(playerName);
    }
  }

  private List<Tweet> getRandomPlayerTweets(String playerName) {
    return List.of(
            new Tweet("1", "Wow, what a stunning performance by " + playerName + " in the match! 🌟🔥 #FootballIcon", "@FootballFanatic"),
            new Tweet("2", playerName + " is a goal-scoring machine! ⚽️🔥 #GoalKing", "@SoccerLover23"),
            new Tweet("3", "Watching " + playerName + " play is a privilege! 🙌⚽️ #FootballMaestro", "@GoalScorer7"),
            new Tweet("4", "What a joy to witness " + playerName + "'s brilliance on the pitch! 🌟🔥 #FootballLegend", "@SportsAddict")
    );
  }

  private List<Tweet> getRonaldoTweets() {
    return List.of(
            new Tweet("1", "Wow, what a stunning performance by Cristiano Ronaldo in the match! 🌟🔥 He's a true football legend, and his skills continue to amaze us all. #RonaldoMagic #FootballIcon", "@FootballFanatic"),
            new Tweet("2", "Cristiano Ronaldo is a goal-scoring machine! ⚽️🔥 His determination and dedication to the game are simply unmatched. #Ronaldo #GoalKing", "@SoccerLover23"),
            new Tweet("3", "GOAT! Cristiano Ronaldo once again proves why he's considered one of the greatest of all time. 🐐🏆 #RonaldoGOAT #FootballPhenomenon", "@GoalScorer7"),
            new Tweet("4", "Watching Ronaldo play is a privilege! 🙌⚽️ His athleticism and talent on the field are out of this world. #RonaldoMagic #FootballMaestro", "@SportsAddict"),
            new Tweet("5", "What a joy to witness Cristiano Ronaldo's brilliance on the pitch! 🌟🔥 He never fails to deliver a top-notch performance. #Ronaldo #FootballLegend", "@FootballFrenzy")
    );
  }

  private List<Tweet> getMessiTweets() {
    return List.of(
            new Tweet("1", "Wow, just witnessed a mesmerizing Messi goal! 🙌🔥 His precision and finesse are simply unmatched. #MessiMagic #FootballLegend", "@FootballFanatic"),
            new Tweet("2", "Messi's goal left me breathless! 🤯⚽️ The way he weaved through defenders with ease was poetry in motion. #MessiMasterclass #GOAT", "@SoccerLover23"),
            new Tweet("3", "GOOOOAAAALLL! Messi does it again! 🚀👏 What a display of skill and determination. He truly is the king of the pitch! #Messi #GoalMachine", "@GoalScorer7"),
            new Tweet("4", "Every time Messi scores, it's like witnessing a work of art on the field. 🎨⚽️ Can't get enough of his brilliance! #MessiGoal #FootballMaestro", "@SportsAddict"),
            new Tweet("5", "No one can stop Messi when he's in the zone! 🌟🔥 That goal was pure brilliance and a testament to his unrivaled talent. #Messi #GoalKing", "@FootballFrenzy"),
            new Tweet("6", "I bow down to the soccer genius that is Messi! 🙇‍♂️⚽️ His latest goal was a reminder of why he's considered the best in the world. #MessiGOAT #FootballPhenomenon", "@SoccerObsessed"),
            new Tweet("7", "Unbelievable goal by Messi! 🤩 The way he effortlessly glides past defenders is like a video game cheat code. #MessiGoal #FootballWizard", "@DiehardFootball"),
            new Tweet("8", "Goal of the century, courtesy of Messi! 🌟🏆 His ability to make the impossible happen is why he's a living legend. #Messi #GoalScorerSupreme", "@SoccerGeek"),
            new Tweet("9", "Incredible stuff from Messi! That goal had me on the edge of my seat the whole time. ⚽️🔥 #MessiMagic #FootballExcellence", "@SportsEnthusiast"),
            new Tweet("10", "I'm running out of words to describe Messi's goal-scoring brilliance! 🤯⚽️ He consistently sets the bar higher for himself. #MessiGoal #FootballGenius", "@FootballInsider")
    );
  }
}
