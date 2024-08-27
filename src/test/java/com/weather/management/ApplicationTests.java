package com.weather.management;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@SpringBootTest
class ApplicationTests {

	@Test
	void findSubstrings(){
		List<Boolean> result1 =  EffictiveStringProcessing.findSubstrings("abcdefghijklmnopqrstuvwxyz", new String[]{"abc", "def", "mno", "xyz", "ijk", "pqr", "lok"});
		assert(Objects.equals(result1.toString(), Arrays.toString((new Boolean[]{true, true, true, true, true, true, false}))));


		List<Boolean> result2 =  EffictiveStringProcessing.findSubstrings("abcdefghijklmnopqrstuvwxyz", new String[]{"abc", "def", "mno", "xyz", "ijk", "aaa"});
		assert(Objects.equals(result2.toString(), Arrays.toString((new Boolean[]{true, true, true, true, true, false}))));
	}


}
