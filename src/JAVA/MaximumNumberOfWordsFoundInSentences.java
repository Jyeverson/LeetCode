package JAVA;

class MaximumNumberOfWordsFoundInSentences {
     public int mostWordsFound(String[] sentences) {
         int maxWords = 0;

         for (String sentence : sentences) {
             int currentWordCount = 0;
             boolean insideWord = false;

             for (char c : sentence.toCharArray()) {
                 if (Character.isWhitespace(c)) {
                     insideWord = false;
                 } else if (!insideWord) {
                     currentWordCount++;
                     insideWord = true;
                 }
             }

             maxWords = Math.max(maxWords, currentWordCount);
         }

         return maxWords;
     }

}