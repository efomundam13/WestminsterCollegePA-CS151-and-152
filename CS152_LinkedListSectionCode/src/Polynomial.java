/**Programmer: Manny Fomundam
	 * Project 4: Polynomial Class
	 * Date: 5/3/2022
	 * Write a Polynomial class that will store polynomials as a linked list 
	 * of Term nodes, where the Term class will be an inner class
	 **/

public class Polynomial {
	public Term poly;
	Polynomial() {
		clear();
	}
	
	Polynomial(int [] Terms) {
		clear();
        setTerms(Terms);
	}
	
	void clear() {
		Term end = new Term(0, 0, null);
        poly = new Term(null, null, end);
	}
	
	void setTerms(int [] terms) {
		if (terms.length % 2 != 0) {
            throw new IllegalArgumentException("Invalid parameter");
        }
        for(int i = 0; i < terms.length - 1; i += 2) {
            int coeff = terms[i];
            int exponent = terms[i + 1];
            addTerm(coeff, exponent);
        }
    }
	
	public String toString() {
		boolean notFirst = false;
        StringBuilder sb = new StringBuilder();
        Term curr = poly.next;

        while (curr != null) {
            String xPart = curr.exponent == 0 ? "" : "x^";
            String coeff = curr.coeff >= 0 && notFirst ? "+" + curr.coeff : String.valueOf(curr.coeff);
            if(curr.coeff == 1) coeff = removeCharAt(coeff, 1);
            String exponent = curr.exponent == 0 ? "" : String.valueOf(curr.exponent);
            sb.append(coeff + xPart + exponent);
            curr = curr.next;
            notFirst = true;
        }

        return sb.toString();
    }

    // Helper method to remove a char at a given index
    private String removeCharAt(String s, int idx) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(i != idx) sb.append(s.charAt(i));
        }
        return sb.toString();
    }

	
	void addTerm(int coeff, int exponent) {
		Term prev = poly;
        Term curr = poly.next;

        if (curr == null) {
            poly.next = new Term(coeff, exponent, null);
            return;
        }

        while (curr != null) {
            if (exponent > curr.exponent) {
                prev.next = new Term(coeff, exponent, curr);
                return;
            } else if (exponent == curr.exponent) {
                curr.coeff += coeff;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

	
	double eval(double val) {
		double ans = 0;
        Term curr = poly.next;

        while(curr != null) {
            ans += (curr.coeff * Math.pow(val, curr.exponent));
            curr = curr.next;
        }

        return ans;
	}
	
	Polynomial multiply(int scalar) {
		Polynomial newPoly = new Polynomial();
        Term curr = poly.next;

        while (curr != null) {
            int coeff = curr.coeff * scalar;
            int exponent = curr.exponent;
            newPoly.addTerm(coeff, exponent);
            curr = curr.next;
        }
        return newPoly;
    }
	
	Polynomial add(Polynomial rhs) {
		Polynomial newPoly = new Polynomial();
        Term curr = poly.next;

        while (curr != null) {
            int coeff = curr.coeff;
            int exponent = curr.exponent;
            newPoly.addTerm(coeff, exponent);
            curr = curr.next;
            rhs.addTerm(coeff, exponent);
        }
        return rhs;
    }
	
	Polynomial multiply(Polynomial rhs) {
		Polynomial newPoly = new Polynomial();
        Term curr = poly.next;
        for(int i = 0; i <= curr.coeff; i++) {
        	 for(int j = 0; j <= curr.exponent; j++) {
        		rhs.poly.coeff += (this.poly.coeff * this.poly.exponent);
        	 }
        }
		return rhs;
	}
	
	
	public static void main(String[] args) {
        // Simple polynomial test
        Polynomial p = new Polynomial();
        p.addTerm(10, 3);
        p.addTerm(3, 6);
        p.addTerm(5, 6);
        p.addTerm(5, 0);
        System.out.println(p);
        p.clear();
        System.out.println(p);

        // Polynomial test from pdf
        Polynomial p2 = new Polynomial(new int[] {5, 6, -3, 3, 1, 2, 12, 0});
        System.out.println(p2.toString());

        // Eval test
        System.out.println(p2.eval(2));

        // Multiply test
        System.out.println(p2.multiply(3));
    }

	class Term {
	    public Integer coeff;
	    public Integer exponent;
	    public Term next;

	    public Term(Integer coeff, Integer exponent, Term next) {
	        this.coeff = coeff;
	        this.exponent = exponent;
	        this.next = next;
	    }
	}
}
