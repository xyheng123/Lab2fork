package org.xyh.P1;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    // 测试目的：验证findRepeatedDnaSequences方法能正确找出长度为10的重复DNA序列
    // 预期结果：对于重复的序列，方法应返回包含这些序列的列表；对于不重复或长度不足的序列，返回空列表或相应的结果
    @Test
    public void testFindRepeatedDnaSequences_WithRepeats() {
        Solution solution = new Solution();
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> expected = Arrays.asList("AAAAACCCCC", "CCCCCAAAAA");
        List<String> actual = solution.findRepeatedDnaSequences(s);
        assertEquals(expected, actual);
    }

    // 测试目的：验证findRepeatedDnaSequences方法在字符串长度小于10时返回空列表
    // 预期结果：返回空列表
    @Test
    public void testFindRepeatedDnaSequences_LengthLessThan10() {
        Solution solution = new Solution();
        String s = "AAAACCCC";
        List<String> expected = Collections.emptyList();
        List<String> actual = solution.findRepeatedDnaSequences(s);
        assertEquals(expected, actual);
    }
    //测试类写的不错小子
}