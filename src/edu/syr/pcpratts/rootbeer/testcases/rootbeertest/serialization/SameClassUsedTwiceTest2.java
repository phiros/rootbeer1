/* 
 * Copyright 2012 Phil Pratt-Szeliga and other contributors
 * http://chirrup.org/
 * 
 * See the file LICENSE for copying permission.
 */

package edu.syr.pcpratts.rootbeer.testcases.rootbeertest.serialization;

import edu.syr.pcpratts.rootbeer.runtime.Kernel;
import edu.syr.pcpratts.rootbeer.test.TestSerialization;
import java.util.ArrayList;
import java.util.List;

public class SameClassUsedTwiceTest2 implements TestSerialization {

  @Override
  public List<Kernel> create() {
    List<Kernel> jobs = new ArrayList<Kernel>();
    for(int i = 0; i < 500; ++i){
      SameClassUsedTwiceRunOnGpu2 curr = new SameClassUsedTwiceRunOnGpu2();
      jobs.add(curr);
    }
    return jobs;
  }

  @Override
  public boolean compare(Kernel lhs, Kernel rhs) {
    SameClassUsedTwiceRunOnGpu2 blhs = (SameClassUsedTwiceRunOnGpu2) lhs;
    SameClassUsedTwiceRunOnGpu2 brhs = (SameClassUsedTwiceRunOnGpu2) rhs;
    return blhs.compare(brhs);
  }
}
