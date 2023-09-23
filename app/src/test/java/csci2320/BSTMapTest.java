package csci2320;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

public class BSTMapTest {
  @Test void emptyOnCreate() {
    Map<String, Integer> map = new BSTMap<>();
    assertEquals(0, map.size());
  }

  // I'm giving you this test of your iterator that does a petty good job of finding
  // standard errors.
  // @Test void testIterator() {
  //   Map<String, Integer> map = new BSTMap<>();
  //   assertEquals(0, map.size());
  //   var keys = List.of("abc", "xyz", "def", "bob", "pat");
  //   var vals = List.of(3, 19, 42, 16, 32);
  //   for (int i = 0; i < keys.size(); ++i) {
  //     map.put(keys.get(i), vals.get(i));
  //   }
  //   assertEquals(keys.size(), map.size());
  //   int cnt = 0;
  //   for (var kvp: map) {
  //     int index = keys.indexOf(kvp.key());
  //     assertEquals(kvp.value(), vals.get(index));
  //     cnt++;
  //     assertTrue(cnt <= keys.size()); // This prevents you from going into an infinite loop if your iterator doesn't stop.
  //   }
  //   assertEquals(keys.size(), cnt);
  // }

  // Testing remove can be hard. This does a randomized test of remove. You should write your own little
  // tests, but 
  // @Test void testRemoveBig() {
  //   BSTMap<String, Integer> map = new BSTMap<>();
  //   assertEquals(0, map.size());
  //   var keys = new ArrayList<String>();
  //   var vals = new ArrayList<Integer>();
  //   var rand = new Random();
  //   for (int i = 0; i < 1000; ++i) {
  //     keys.add(App.randomString(rand, 10));
  //     vals.add(rand.nextInt());
  //     map.put(keys.get(i), vals.get(i));
  //   }
  //   Collections.shuffle(keys);
  //   for (int i = 0; i < keys.size(); ++i) {
  //     var key = keys.get(i);
  //     var value = map.get(key).get();
  //     assertTrue(map.contains(key));
  //     assertEquals(Optional.of(value), map.remove(key));
  //     map.preorderPrintKeys();
  //     assertTrue(map.isConsistent());
  //     assertFalse(map.contains(key));
  //     assertEquals(keys.size()-i-1, map.size());
  //   }
  // }

}
