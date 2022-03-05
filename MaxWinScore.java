/*
In an online game, N blocks are arranged in a hierarchical manner. All the blocks are connected together by a total of N-1 connections. Each block is given an ID from 1 to N. A block may be further connected to other blocks. Each block is also assigned a specific point value.

A player starts from Block 1. She must move forward from each block to a directly connected block until she reaches the final block, which has no further connection. When the player lands on a block, she collects the point value of that block. The players score is calculated as the product of point values that the player collects.
Find the maximum score a player can achieve.
Note: The answer can always be represented with 64 bits.
            4
           / \
          2    8
        / \   / \
       2   1  3  4
*/
public class MaxWinScore {
    public Long findMaxScore(Node root) {
        if (root == null)
            return (long) 1;
        Long left = findMaxScore(root.left);
        Long right = findMaxScore(root.right);
        return Math.max((root.data * left), (root.data * right));
    }
}

class Node {
    int data;
    Node right;
    Node left;

    Nonde(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
