int adjacentElementsProduct(int[] inputArray) {
    
    int greaterSum = inputArray[0] * inputArray[1];
    int i = 1;
    int j = 2;

    while (j < inputArray.length) {
        greaterSum = Math.max(inputArray[i] * inputArray[j], greaterSum);
        i = j;
        j++;
    }

    return greaterSum;
}

