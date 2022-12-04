public class MainProgramParagraph {

    public static void main(String[] args) {
        MyParagraph myParagraph = new MyParagraph("Wildlife is a precious gift from God for this planet.The term fauna is not only for wild animals but also for all non-domesticated life forms including birds, insects, plants, fungi and even microscopic organisms.To maintain a healthy ecological balance on this land, animals, plants and marine species are as important as humans.Every organism on this earth has a unique place in the food chain that contributes to the ecosystem in its own way.But, unfortunately today, many animals and birds are endangered.");

        myParagraph.sentenceCount();
        myParagraph.wordsPerSentence();
        myParagraph.sortedWordsPerSentence();
        myParagraph.vowelsandConsonantsPerSentence();
    }
}
