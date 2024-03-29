### 归并排序（Merge Sort）

归并排序使用的就是分治思想

![](img/MergeSort/mergeSort.gif)

##### 时间复杂度：

最好：O(nlogn) 最坏：O(nlogn) 平均：O(nlogn)

##### 空间复杂度：

O(n)

|    是否原地排序     | 是否稳定排序 | 是否基于比较 | 是否需要额外空间 |
|:-------------:|:------:|:------:|:--------:|
| 是（时间复杂度 O(1)） |   是    |   否    |    是     |


```Java
public class MergeSort {

    public static void main(String[] args) {
        int[] array = new int[]{11, 5, 8, 6, 3, 9, 2, 1, 4, 7};
        int[] sort = sort(array);
        System.out.println(Arrays.toString(sort));
    }

    public static int[] sort(int[] array) {
        if (array.length < 2) return array;
        // 把原数组分为左右2部分
        int middle = (int) Math.floor(array.length / 2);
        int[] left = Arrays.copyOfRange(array, 0, middle);
        int[] right = Arrays.copyOfRange(array, middle, array.length);
        // 递归合并
        return merge(sort(left), sort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        // 存放排序后的数组
        int[] result = new int[left.length + right.length];
        int i = 0;
        while (left.length > 0 && right.length > 0) {
            if (left[0] <= right[0]) {
                result[i++] = left[0];
                left = Arrays.copyOfRange(left, 1, left.length);
            } else {
                result[i++] = right[0];
                right = Arrays.copyOfRange(right, 1, right.length);
            }
        }
        while (left.length > 0) {
            result[i++] = left[0];
            left = Arrays.copyOfRange(left, 1, left.length);
        }
        while (right.length > 0) {
            result[i++] = right[0];
            right = Arrays.copyOfRange(right, 1, right.length);
        }
        return result;
    }
}
```

