package com.tata.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(-1);
		list.add(10);
		Stream<Integer> s1 = list.stream();
		Stream filtered = s1.filter(new Predicate<Integer>() {

			@Override
			public boolean test(Integer arg0) {
				System.out.println(arg0);
				return arg0>0;
			}
		});
		Optional<Integer> reduced = filtered.reduce(new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer previous, Integer current) {
				System.out.println(previous+", "+current);
				return previous+ current;
			}
		});
		System.out.println(reduced.get());
		
//		List<Integer> finalvalue= (List<Integer>) filtered.collect(Collectors.toList());
//		System.out.println(finalvalue);
	}
}
