package com.company;

/*

1523. Level 15 lection 12. Overloading constructors
1. In the Solution class, create 4 constructors with different access modifiers.
2. In a separate file, create the SubSolution class and make it a descendant of the Solution class.
3. Inside the SubSolution class, create constructors with the Alt + Insert -> Constructors command.
4. Fix the constructors access modifiers in SubSolution so that you get 3 constructors with different access modifiers (all except private).

Requirements:
1. The SubSolution class must contain 3 different constructors.
2. The Solution class must contain 4 different constructors.
3. In the Solution class, constructors with all possible access modifiers must be declared.
4. In the SubSolution class, constructors must be declared with all possible access modifiers except private.
5. The Solution class must be the parent of the SubSolution class.


 */

public class Solution {
    public Solution () {
    }
    Solution (int i) {
    }
    protected Solution (double d) {
    }
    private Solution (String s) {
    }
    public static void main(String[] args) {

    }
}
class SubSolution extends Solution {
    public SubSolution() {
    }

    protected SubSolution(int i) {
        super(i);
    }

    SubSolution(double d) {
        super(d);
    }
}

