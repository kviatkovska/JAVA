package method;

class GenericMethodDemo {
    static <Т extends Comparable<T>, V extends Т> boolean
    arraysEqual(T[] х, V[] у) {
        if (x.length != y.length) return false;
        for (int i = 0; i < x.length; i++)
            if (!х[i].equals(у[i]))
                return false;
        return true;
    }

    public static void main(String args[]) {
        Integer nums[] = {1, 2, 3, 4, 5};
        Integer nums2[] = {1, 2, 3, 4, 5};
        Integer nums3[] = {1, 2, 7, 4, 5};
        Integer nums4[] = {1, 2, 7, 4, 5, 6};

        if (arraysEqual(nums, nums))
            System.out.println("nums еквівалентний nums");
        if (arraysEqual(nums, nums2))
            System.out.println("nums еквівалентний nums2");
        if (arraysEqual(nums, nums3))
            System.out.println("nums еквівалентний nums3");
        if (arraysEqual(nums, nums4))
            System.out.println("nums еквівалентний nums4");
// Double dvals[] = {1.1, 2.2, 3.3, 4.4, 5.5};
// Наступний рядок не буде скомпільований, оскільки типи масивів nums і dvals не збігаються.
// if (arraysEqual (nums , dvals)}
// System.out.println ( "nums еквівалентний dvals");
    }
}
