/**
 * Created by kyran on 16/03/17.
 */
class VerySecureEncryption {

    //https://community.topcoder.com/stat?c=problem_statement&pm=14005

    /*
    You are going to send a message to your friend. The message is given as the String message. To confuse potential eavesdroppers, you are going to scramble the message.



Scrambling of a message is performed using the int[] key. If a letter is at the (0-based) position i in the original message, it will appear at the position key[i] in the scrambled message. (The constraints given below guarantee that this process will produce a valid scrambled message.)



To make the encryption even more confusing, you are going to repeat the above process K times in a row. Given message, key, and the int K, find and return the final encrypted message.
     */

    String encrypt(String message, int[] key, int K) {

        char[] messageArray = message.toCharArray()

        for (int i = 0; i < K; i++) {
            char[] newMessage = new char[messageArray.size()]
            for (int j = 0; j < key.size(); j++) {
                newMessage[key[j]] = messageArray[j]
            }
            messageArray = newMessage
        }

        return new String(messageArray)
    }




}
