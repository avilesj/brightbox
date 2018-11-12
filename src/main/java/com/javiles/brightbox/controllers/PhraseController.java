package com.javiles.brightbox.controllers;

import com.javiles.brightbox.models.Phrase;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhraseController
{
    @RequestMapping("/phrase")
    public Phrase getPhrase()
    {
        Phrase phrase = new Phrase();
        phrase.setText("Testing");
        return phrase;
    }
}
