package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    private CaesarShiftCipher caesarShiftCipher = new CaesarShiftCipher();
    @Test
    void testEmptyString() {
        Assertions.assertEquals(caesarShiftCipher.CaesarShiftCipher("",26),"");
    }
    @Test
    void testSameCharacter() {
        Assertions.assertEquals(caesarShiftCipher.CaesarShiftCipher("aaaaaa",3),"dddddd");
    }
    @Test
    void testOneCharacter() {
        Assertions.assertEquals(caesarShiftCipher.CaesarShiftCipher("z",27),"a");
    }
    @Test
    void test26Alphabet() {
        char[] alphabet = new char[26];
        for(int i = 0; i < 26; i++) {
            alphabet[i] = (char)(i+'a');
        }
        char[] shiftAlphabet = new char[26];
        shiftAlphabet[25] = 'a';
        for(int i = 1; i < 26; i++) {
            shiftAlphabet[i-1] = (char)(i+'a');
        }
        Assertions.assertEquals(caesarShiftCipher.CaesarShiftCipher(new String(alphabet),1),new String(shiftAlphabet));

    }

    @Test
    void testAnagramsString() {
        Assertions.assertEquals(caesarShiftCipher.CaesarShiftCipher("aabb",-1),"zzaa");
    }
    @Test
    void testNotValid() {
        Assertions.assertEquals(caesarShiftCipher.CaesarShiftCipher("?-+",14),"invalid");
    }
    // empty string ex: ""
    // string had the same character: aaaaaaa
    // string one character : a
    // string 26 alphabet a->z
    // symmetry anagrams abba
    // character is not alphabet ? -+$@^




}
