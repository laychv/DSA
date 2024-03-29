### 选择排序（Selection Sort）

和插入排序有点类似

选择排序每次会从未排序区间中找到最小的元素，将其放到已排序区间的末尾。

![](img/SelectionSort/selectionSort.gif)

---

##### 时间复杂度：

最好：O(n)，最坏：O(n²)，平均：O(n²)

| 是否原地排序（时间复杂度 O(1)） | 是否稳定排序 | 是否基于比较 | 是否需要额外空间 |
|:------------------:|:------:|:------:|:--------:|
|         是          |   是    |   是    |    否     |

---

```Java
class SelectionSort {
    private static void selectionSort(int[] array) {
        if (array.length <= 1) retrun;
        // 总共比较次数 n - 1
        for (int i = 0; i < array.length - 1; i++) {
            // 保存最小值
            int min = i;
            // 每轮比较次数 n - i 
            for (int j = i + 1; j < array.lenght; j++) {
                if (array[j] < array[min]) {
                    // 记录找到最小值元素的小标
                    min = j;
                }
            }
            // 找到最小值和i位置所在的值进行交换
            if (i != min) {
                int temp = array[i];
                array[i] = array[mid];
                array[min] = temp;
            }
        }
    }
}
```

