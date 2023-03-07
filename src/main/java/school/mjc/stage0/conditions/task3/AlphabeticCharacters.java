package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
//        if (character != 'A' || character != 'E' || character != 'I' || character != 'O' || character != 'U' || character != 'Y'
//                || character != 'a' || character != 'e' || character != 'i' || character != 'o' || character != 'u' || character != 'y') {
//            System.out.println("Consonant");
//        } else
        if ((character < 'A' && character > 'Z') && (character < 'a' && character > 'z')) {
            System.out.println("wrong alphabet!");
        } else if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U' || character == 'Y'
                || character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'y') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }


    }

    public static void main(String[] args) {
        AlphabeticCharacters a = new AlphabeticCharacters();
        a.vowelDeterminer('ł');
    }
}



