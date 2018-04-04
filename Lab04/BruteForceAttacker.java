package cz.cvut.fel.pjv;

public class BruteForceAttacker extends Thief {


    public int sizeOfPassword;

    @Override
    public void breakPassword(int sizeOfPassword) {
        // write your code
        this.sizeOfPassword = sizeOfPassword;
        char[] predpoklad = new char[sizeOfPassword];
        char[] naborbukv = getCharacters(); // gets to know symbols in the password


        permutePassword(predpoklad, naborbukv, 0);
    }

    public void permutePassword(char[] predpoklad, char[] naborbukv, int input) {
       if (isOpened()) return;

            if (sizeOfPassword == input) {
                if (tryOpen(predpoklad) == true) {
                    return;
                } else return;
            }


        for(int i = 0; i < naborbukv.length; i++){
            predpoklad[input] = naborbukv[i];
            permutePassword(predpoklad, naborbukv, input + 1);
        }
    }
}
