package com.pegaganarea.example.indonesiafacts;

import java.util.Random;

/**
 * Created by AgungJP on 18/06/2015.
 */
public class ContentFacts {
    //Content of Indonesia Facts with Array
    public String[] mFacts = {
            "The debt ratio in Indonesia No. 129 in the world, lower than Japan and the United States, but still higher than Russia.",
            "Indonesia's natural gas reserves 3 trillion cubic meters, number 13 in the world and enough to meet domestic demand until 30 Years.",
            "There are 1.3 Million People Created Website Address Indonesia.",
            "The number of mobile phones in Indonesia reached 280 million. No. 4 in the World.",
            "There are over 1100 species will be extinct in Indonesia, including one-horned rhino and the Sumatran tiger.",
            "in Indonesia 51.5 percent of the population live in cities, annually increase by 5%.",
            "There are more women in Indonesia, in 2030 estimated there are more than 15 million inhabitants women than men.",
            "Japan is Indonesia's largest export destination. If Japan stopped its import taps, the average income of the people of Indonesia will shrink 20%.",
            "Bahasa is Number 5 Most Widely used in Indonesia, More than Portuguese and French.",
            "There are Treasure Worth 1 Billion More in Indonesian waters."};

    //metode getFact
    public String getFact(){
        //inisialition of fact
        String fact ="";

        //random select fact
        Random randomGenerator = new Random();
        int randomNumber;
        randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;
    }
}
