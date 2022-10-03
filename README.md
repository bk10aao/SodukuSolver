#Soduku Solver

This project will solve a soduku based off of a 2d array.

An example, as in the code for a valid puzzle:

``` 
     int[][] board =              { {7, 0, 2, 0, 5, 0, 6, 0, 0},
                                    {0, 0, 0, 0, 0, 3, 0, 0, 0},
                                    {1, 0, 0, 0, 0, 9, 5, 0, 0},
                                    {8, 0, 0, 0, 0, 0, 0, 9, 0},
                                    {0, 4, 3, 0, 0, 0, 7, 5, 0},
                                    {0, 9, 0, 0, 0, 0, 0, 0, 8},
                                    {0, 0, 9, 7, 0, 0, 0, 0, 5},
                                    {0, 0, 0, 2, 0, 0, 0, 0, 0},
                                    {0, 0, 7, 0, 4, 0, 2, 0, 3} };
                     
                     
```
And for an invalid puzzle:

```
     int[][] unsolvableBoard =    { {7, 7, 2, 0, 5, 0, 6, 0, 0},
                                    {0, 0, 0, 0, 0, 3, 0, 0, 0},
                                    {1, 0, 0, 0, 0, 9, 5, 0, 0},
                                    {8, 0, 0, 0, 0, 0, 0, 9, 0},
                                    {0, 4, 3, 0, 0, 0, 7, 5, 0},
                                    {0, 9, 0, 0, 0, 0, 0, 0, 8},
                                    {0, 0, 9, 7, 0, 0, 0, 0, 5},
                                    {0, 0, 0, 2, 0, 0, 0, 0, 0},
                                    {0, 0, 7, 0, 4, 0, 2, 0, 3} }; 
```
