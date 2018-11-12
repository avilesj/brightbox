package com.javiles.brightbox;

import com.javiles.brightbox.repositories.PhraseRepository;
import com.javiles.brightbox.repositories.PhraseRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BrightBoxConfig
{
    @Bean
    public PhraseRepository phraseRepository()
    {
        return new PhraseRepositoryImpl();
    }
}
