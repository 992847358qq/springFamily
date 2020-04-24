package com.example.springgeek.lucene;

/**
 * @Author: wgl
 * @Date: 2020/04/24 18:21
 * @Description:
 */

import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

import java.nio.file.Paths;

/**
 * 检索
 */
public class Searcher {
    //获取要查询的路径，也就是索引所在的位置
    public static void search(String indexDir, String q) throws Exception {
        Directory directory = FSDirectory.open(Paths.get(indexDir));

    }
}
