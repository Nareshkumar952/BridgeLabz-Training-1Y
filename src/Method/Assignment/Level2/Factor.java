void main() {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int c = 0;
    for (int i = 1; i <= a; i++) {
        if (a % i == 0) {
            c++;
        }
    }
    int arr[] = new int[c];
    for (int i = 1; i <= a; i++) {
        if (a % i == 0) {
            arr[i - 1] = i;
        }
    }
    for (int i = 0; i < c; i++) {
        IO.print(arr[i] + " ");
    }
}
