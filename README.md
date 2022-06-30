# ArraySum

The original question on [Stack Overflow](https://stackoverflow.com/questions/72805749/give-advice-on-the-2d-array-and-array-looping-in-java-please?noredirect=1#comment128607046_72805749) can be restated as follows.

Given a two-dimensional array, I wish to sum each 2 x 2 subarray and produce an output two-dimensional array.  For example, if I have the folllowing 4 x 5 input array

     50  45  47  52  54
     49  52  50  50  51
     51  52  51  45  48
     50  47  54  47  52
     
I wish to produce the following 3 x 4 output array.

    196 194 199 207
    204 205 196 194
    200 204 197 192

In order to do this, you'll need four nested `for` loops.

The first two `for` loops will loop through the starting position of the subarray you want to sum.  The second two `for` loops will loop through the subarray, summing the values.
