package com.example.gof.creation.abstractfactory;

public interface VocabGeneratorFactory {
    void createLemmatization();
    void createAutomaticFilter();
    void createTokenizer();
    void createStopwordsEraser();

}
