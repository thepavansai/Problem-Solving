//{ Driver Code Starts
#include <iostream>

using namespace std;

// } Driver Code Ends
class Solution {
public:
  void printTriangle(int n) {
    // code here
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        cout << " ";
      }
      for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
        cout << "*";
      }
      for (int j = 0; j < i; j++) {
        cout << " ";
      }
      cout << endl;
    }
  }
  void nStarDiamond(int n) {
    // Write your code here.
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        cout << " ";
      }
      for (int j = 1; j <= 2 * i + 1; j++) {
        cout << "*";
      }
      for (int j = 0; j < n - i - 1; j++) {
        cout << " ";
      }
      cout << endl;
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        cout << " ";
      }
      for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
        cout << "*";
      }
      for (int j = 0; j < i; j++) {
        cout << " ";
      }
      cout << endl;
    }
  }
  void nStarTrianglei(int n) {
    // Write your code here.
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        cout << "*";
      }
      for (int j = 0; j < n - i - 1; j++) {
        cout << " ";
      }
      cout << endl;
    }
    for (int i = 00; i < n; i++) {
      for (int j = 1; j < n - i; j++) {
        cout << "*";
      }
      for (int j = 1; j < i; j++) {
        cout << " ";
      }
      cout << endl;
    }
  }
  void nBinaryTriangle(int n) {
    // Write your code here.
    for (int i = 0; i < n; i++) {
      int s;
      if (i % 2 == 0) {
        s = 1;
      } else {
        s = 0;
      }
      for (int j = 0; j < i; j++) {
        cout << s;
        s = 1 - s;
      }
      cout << endl;
    }
  }
  void numberCrown(int n) {
    // Write your code here.
    for (int i = 0; i < n; i++) {
      int ci = 0;
      for (int j = 0; j <= i; j++) {
        ci = ci + 1;
        cout << ci << " ";
      }
      for (int j = 0; j < 2 * n - 2 * (i + 1); j++) {
        cout << " ";
      }
      for (int j = 0; j <= i; j++) {
        cout << ci << " ";
        ci = ci - 1;
      }
      cout << endl;
    }
  }
  void nNumberTriangle(int n) {
    // Write your code here.
    int ci = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        ci += 1;
        cout << ci << " ";
      }
      cout << endl;
    }
  }
  void nLetterTriangle(int n) {
    // Write your code here.

    for (int i = 0; i < n; i++) {
      char c = 65;
      for (int j = 0; j <= i; j++) {
        cout << c << " ";
        c = c + 1;
      }
      cout << endl;
    }
  }
  void nLetterTrianglea(int n) {
    // Write your code here.
    for (int i = 0; i < n; i++) {
      for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
        cout << ch << " ";
      }
      cout << endl;
    }
  }
  void alphaHill(int n) {
    // Write your code here.
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < n - i; j++) {
        cout << " ";
      }
      char x = 'A';
      for (int j = 0; j <= i; j++) {
        cout << x << " ";
        x = x + 1;
      }
      x--;
      for (int j = 0; j < i; j++) {
        x = x - 1;
        cout << x << " ";
      }
      cout << endl;
    }
  }
  void symmetry(int n) {
    // Write your code here.
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i; j++) {
        cout << "* ";
      }
      for (int j = 1; j <= 2 * i; j++) {
        cout << "  ";
      }
      for (int j = 0; j < n - i; j++) {
        cout << "* ";
      }
      cout << endl;
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        cout << "* ";
      }
      for (int j = 0; j < n - i; j++) {
        cout << "  ";
      }
      for (int j = 0; j <= i; j++) {
        cout << "* ";
      }
      cout << endl;
    }
  }
  void getStarPattern(int n) {
    // Write your code here.
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
          cout << "*";
        } else {
          cout << " ";
        }
      }
      cout << endl;
    }
  }
  void symmetrystar(int n) {
    // Write your code here.
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        cout << "* ";
      }
      for (int j = 0; j < n - i - 1; j++) {
        cout << "    ";
      }
      for (int j = 0; j <= i; j++) {
        cout << "* ";
      }
      cout << endl;
    }
    for (int i = 1; i < n; i++) {
      for (int j = 1; j <= n - i; j++) {
        cout << "* ";
      }
      for (int j = 0; j < i; j++) {
        cout << "    ";
      }
      for (int j = 1; j <= n - i; j++) {
        cout << "* ";
      }
      cout << endl;
    }
  }
  void getNumberPattern(int n) {
    // Write your code here.
    for (int i = 0; i < 2 * n - 1; i++) {
      for (int j = 0; j < 2 * n - 1; j++) {
        int top = i;
        int left = j;
        int right = 2 * (n - 1) - j;
        int b = 2 * (n - 1) - i;
        cout << (n - min(min(top, b), min(left, right)));
      }
      cout << endl;
    }
  }
};

//{ Driver Code Starts.

int main() {
  int n = 5;
  Solution ob;
  ob.printTriangle(n);
  cout << endl << endl;
  ob.nStarDiamond(n);
  cout << endl << endl;
  ob.nStarTrianglei(n);

  return 0;
}
// } Driver Code Ends
