package hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class UnexpectedDemand {

    public static int filledOrders(List<Integer> order, int k) {

        int len=order.size();

        int count=0;

        Collections.sort(order);

        for(int ord:order)

        {

                if(ord<=k)

                {

                      count++;

                      k=k-ord;

                }

         }

            return count;

}

}
