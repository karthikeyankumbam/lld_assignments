package com.practice.Assignments.lld1.day_126.classwork.threadswithcallables2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
     Node root;
     ExecutorService executorService;

    public TreeSizeCalculator(Node root,ExecutorService executorService)
    {
        this.root=root;
        this.executorService=executorService;
    }

    @Override
    public Integer call() throws Exception {
        if(root==null) return 0;
        TreeSizeCalculator left=new TreeSizeCalculator(root.left,executorService);
        TreeSizeCalculator right=new TreeSizeCalculator(root.right,executorService);

        Future<Integer> leftTreeSize=executorService.submit(left);
        Future<Integer> rightTreeSize=executorService.submit(right);

        return leftTreeSize.get()+rightTreeSize.get()+1;
    }
}
