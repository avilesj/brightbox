package com.javiles.brightbox.repositories;

import com.javiles.brightbox.models.Phrase;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

@Repository
public class PhraseRepositoryImpl implements PhraseRepository
{
    private ArrayList<Phrase> phrases;
    private ArrayList<String> messages;
    private void generatePhrases()
    {
        this.messages = new ArrayList<>();
        this.messages.add("Te amo Dayrine <3");
        this.messages.add("Best 2 and half years of my life <3");
        this.messages.add("Believe that the sun will shine tomorrow");

        this.phrases = new ArrayList<>();

        for(int i =0; i < messages.size(); i++)
        {
            Phrase phrase = new Phrase();
            phrase.setText(messages.get(i));
            phrases.add(phrase);
        }
    }

    public Phrase generatePhrase()
    {
        generatePhrases();
        int randomNum = ThreadLocalRandom.current().nextInt(0, this.messages.size());
        return phrases.get(randomNum);
    }
}
