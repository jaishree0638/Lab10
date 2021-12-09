@Test
    public void testMixed(){
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = -9;
        arr[2] = 7;
        arr[3] = -10;
        arr[4] = 0;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = 0;
        Sortedarr[3] = 7;
        Sortedarr[4] = 8;
        sort.basicSelectionSort(arr);
        assertArrayEquals(arr, Sortedarr);
    }

    @Test
    public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 7;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 7;
        Sortedarr[3] = 8;
        Sortedarr[4] = 10;
        sort.basicSelectionSort(arr);
        assertArrayEquals(arr, Sortedarr);
    }

}
