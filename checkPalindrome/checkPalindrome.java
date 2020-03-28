boolean checkPalindrome(String inputString) {

    int i = 0;
    int j = inputString.length() - 1;

    while (i < j) {
        if (inputString.charAt(i) != inputString.charAt(j)) {
            return false;
        }

        i++; j--;
    }

    return true;
}
