package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    static Solution solution;

    int[] nums;

    @BeforeAll
    static void setup(){

        solution = new Solution();
    }

    @Test
    public void ArrayWith1NumbersAlwaysCanJump(){

        nums = new int[] {0};

        assertTrue(solution.canJump(nums));
    }

    @Test
    public void ArrayWith2NumbersAndCanJump(){

        nums = new int[] {1,0};

        assertTrue(solution.canJump(nums));
    }

    @Test
    public void ArrayWith2NumbersAndCantJump(){

        nums = new int[] {0,0};

        assertFalse(solution.canJump(nums));
    }

    @Test
    public void ArrayWith5NumbersAndCanJump(){

        nums = new int[] {2,2,0,1,4};

        assertTrue(solution.canJump(nums));
    }

    @Test
    public void ArrayWith5NumbersAndCantJump(){

        nums = new int[] {3,2,1,0,4};

        assertFalse(solution.canJump(nums));
    }
}
