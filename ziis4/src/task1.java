public class task1 {
        public static void main(String[] args) {
            String key = "ABCDEFG";
            String ori = "PROGRAMM";
            String enc = encrypt(ori, key);
            System.out.println(enc);
            System.out.println(decrypt(enc, key));
        }

        static String encrypt(String text, final String key) {
            String res = "";
            text = text.toUpperCase();
            for (int i = 0, j = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (c < 'A' || c > 'Z') continue;
                res += (char)((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
                j = ++j % key.length();
            }
            System.out.println("Зашифрований текст: ");
            return res;
        }

        static String decrypt(String text, final String key) {
            String res = "";
            text = text.toUpperCase();
            for (int i = 0, j = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (c < 'A' || c > 'Z') continue;
                res += (char)((c - key.charAt(j) + 26) % 26 + 'A');
                j = ++j % key.length();
            }
            System.out.println("Розшифрований текст: ");
            return res;
        }
    }