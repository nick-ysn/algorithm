# algorithm
各种算法的学习，排序/查找/树/图

#### 插入排序: InsertionSort
    插入排序类似玩扑克牌，第一次左手拿一张牌，这张牌自然排好序，然后依次从右手中拿出每一张牌按大小顺序插入到左手牌堆中的合适位置，则左手为排好序的牌

#### 归并排序: MergeSort
    归并排序为递归解决子任务的经典问题。将待排序的数组依次分解为单个元素的子问题，然后在依次将元素合并排序

#### 堆排序:  HeapSort
    堆排序分为三个步骤: 
    1.维护堆的性质(堆中每个元素一定比它的所有子节点大或比所有子节点小)
    2.建堆(将一个数组建成大顶堆或小顶堆)
    3.堆排序(依次将堆顶元素和堆的最后一个元素进行交换，缩小堆并维护堆的性质，则交换后的数据即是排序好的数据)
    
#### 快速排序: QuickSort
    快速排序是一种采用分治思想的排序算法，算法的核心是划分
    - 将数组中小于某个值的所有数据全部放在该值的左边
    - 将大于某个值的所以数据全部放在该值右边
    - 然后左右两边的数据分别递归重复该操作，直到只有一个元素时停止
    
    Example:
    考虑数组[2,1,1,6,4,5,3] , 设定位元为最后一位，即X = 3, 变量i代表比X小的数据位置
    
    (1) i = -1 j = 0 => A[j] = 2 < 3 => i = i + 1 ,exchange(A[i],A[j]) = > [2,1,1,6,4,5,3]
    (2) i = 0  j = 1 => A[j] = 1 < 3 => i = i + 1 ,exchange(A[i],A[j]) = > [2,1,1,6,4,5,3]
    (3) i = 1  j = 2 => A[j] = 1 < 3 => i = i + 1 ,exchange(A[i],A[j]) = > [2,1,1,6,4,5,3]
    (4) i = 2  j = 3 => A[j] = 6 > 3 continue
    (5) i = 2  j = 4 => A[j] = 4 > 3 continue
    (6) i = 2  j = 5 => A[j] = 5 > 3 continue (j 循环结束)
    (7) exchange(A[i+1],A[end])  = > [2,1,1,3,4,5,6]
    (8) 产生两个子数组[2,1,1] [4,5,6] 分别重复上述过程