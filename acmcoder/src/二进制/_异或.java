package 二进制;

import java.util.Scanner;

public class _异或 {
	public static void main(String[] args) {
        trieNode root = new trieNode();//根节点不存有效值
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] items = new int[n];
        for(int i=0; i<n; i++){
            items[i] = sc.nextInt();
            insert(root, items[i]);
        }
        long result = 0;
        for(int num : items){
            result  += query(root, num, m, 31);//31到0是整数能表示的范围,因为整数就占4个字节，4*8=32，正好是0到31
        }
        System.out.println(result/2);//除以二是因为一对答案算了两遍，例如一个答案是(p,q)，那么a=p,b=q的时候一遍，a=q,b=p又一遍
    }

    /**
     * 将一个number加入到root中
     * @param root
     * @param number
     */
    public static void insert(trieNode root, int number){
        trieNode current = root;
        for(int i=31; i>=0; i--){//先存放高位数字比如数字5，二进制为0101，则存放顺序是0,1,0,1
            //求解对应第i位置处二进制数字是0还是1
            int digit = (number>>i)&1;//一共管31位，也就是树的高度为31位
            //看走0那一叉还是1那一叉
            if(current.next[digit]==null){
                current.next[digit] = new trieNode();
            }
            current = current.next[digit];
            current.count++;//count表示有多少分支走过这个节点
        }
    }

    /**
     * @param root//trieTree树
     * @param a//a是做异或运算的其中的一个值
     * @param m//和异或结果进行比较的数字，大于m记录值加1
     * @param k//number转换为二进制后对应的第k位置上的数字
     * @return
     */
    public static int query(trieNode root, int a, int m, int k){
        if(root == null){
            return 0;
        }
        trieNode current = root;
        for(int i=k; i>=0; i--){
            int aDigit = (a>>i)&1;
            int mDigit = (m>>i)&1;
            //如果a和m这一位都是1，那么为了不比m小，b这一位必须是0。此时还不能比出大小，继续
            if(aDigit == 1 && mDigit == 1){
                if(current.next[0] == null){//对应k位置处的数字若为空，则返回0.
                    //这里必须手动判断是否为null,因为它处在循环中，是null的话并不会跳出循环，而是会继续执行
                    return 0;
                }else{
                    current = current.next[0];//返回第k位置为0的数字的个数
                }
                //如果a是0，m是1，那么b必须是1，此时同样不能比出大小
            }else if(aDigit == 0 && mDigit ==1){
                if(current.next[1] == null){
                    return 0;
                }else {
                    current = current.next[1];
                }
                //如果a是0，m也是0，此时b这一位可以是1，也可以是0.如果是1那就比出大小了，可以直接返回，是0的话需要继续比
            }else if(aDigit == 0 && mDigit == 0){
                int p = query(current.next[0], a, m, i-1);
                int q = (current.next[1]==null?0:current.next[1].count);
                return p+q;//这里可以得到结果，返回结果
                //如果a是1，m是0，此时b这一位可以是1，也可以是0.如果是0那就比出大小了，可以直接返回，是1的话需要继续比
            }else if(aDigit == 1 && mDigit == 0){
                int p = query(current.next[1], a, m, i-1);
                int q = (current.next[0]==null?0:current.next[0].count);
                return p+q;
            }
        }
        return 0;
    }
}

//存放所有数字的二进制的形式的字典树
class trieNode{
    trieNode[] next = new trieNode[2];//存放孩子结点，只有0和1两种数字
    int count = 0;//此处包含的数字0或1的个数
}

