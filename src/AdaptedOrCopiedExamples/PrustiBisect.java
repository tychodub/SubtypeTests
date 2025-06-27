package AdaptedOrCopiedExamples;

// adapted example from: https://github.com/viperproject/prusti-dev

// original code in Rust:
/*
/// A monotonically increasing discrete function, with domain [0, domain_size)
trait Function {
  fn domain_size(&self) -> usize;
  fn eval(&self, x: usize) -> i32;
}

/// Find the `x` s.t. `f(x) == target`
fn bisect<T: Function>(f: &T, target: i32) -> Option<usize> {
  let mut low = 0;
  let mut high = f.domain_size();
  while low < high {
    let mid = (low + high) / 2;
    let mid_val = f.eval(mid);
    if mid_val < target {
      low = mid + 1;
    } else if mid_val > target {
      high = mid;
    } else {
      return Some(mid)
    }
  }
  None
}
*/

import java.util.OptionalInt;

public class PrustiBisect {

    private int domain_size() {
        // assume false
        return 0; // dummy value
    }

    private int eval(int x) {
        // assume false
        return x+1;
    }

    public Integer bisect(int target) {
        int low = 0;
        int high = domain_size();
        while (low < high) {
            int mid = (low + high) / 2;
            int mid_val = eval(mid);
            if (mid_val < target) {
                low = mid + 1;
            } else if (mid_val > target) {
                high = mid;
            } else {
                return new Integer(mid);
            }
        }
        return null;
    }
}
