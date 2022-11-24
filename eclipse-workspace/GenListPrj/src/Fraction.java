

public class Fraction {
	private long num, den;

	private long gcd() {// ����� �� �������� �� ��� � ����������� ���������� �� ������
		long n = num, d = den, // ��������� �� ����� �� num � den �� �� �� �� �������� ������������ �����
				t;// ������� ��� ������������ ���������� �� swap
		if (n == 0 || d == 0)
			return 0; // ��� ��������� ��� ����. � 0, ���� ����� ������ �� �� ���������
		if (n < 0)
			n = -n;// ����� ����� ��������� ������������ �����������, �� �� ����� ������ � �������
		if (d < 0)
			d = -d;
		if (n < d) {
			t = n;
			n = d;
			d = t;// ��� ����������� � ��-�����, ������� �� ������� �������, �� �� ���� �� �����
					// ��������� �� �����������
		}
		do {
			t = n % d;
			if (t == 0)
				return d;
			n = d;
			d = t;
		} while (true);// �������� �����, ����� �� ������ ���, ���� ����� ������� �� �������� ���
						// ����������, � ������ ��������
	}

	private void norm() {// "�������� ��� �� ������"(����� � ��������),����� � ���� ������ ���� �� ��
							// �������(����. 2/4 � 1/2)
		if (den == 0)
			return;// ��� ����. � 0 �� �����
		if (num == 0) {
			den = 1;
			return;// ��� ���� � � 0, ���������� ������ �� ����. 1 � �� �����, ������ ���� ����� ��
					// �� "�����������"
		}
		if (den < 0) {
			num = -num;
			den = -den;// ��� ��� ����� � �����������
		}
		long d = gcd();// ������������ ����������, ����� �� ������� �������� ��������� � �����������
						// ���� ������ gcd
		num /= d;
		den /= d;
	}

	public Fraction(long n, long d) {// ����������(��� �� ������� ����, ���� ���� ���� �� �������)
		num = n;
		den = d;
		norm();
	}

	public Fraction(long n) {// ����� �� ������ ��� �� ������ ���� ����������
		num = n;
		den = 1;
	}

	public Fraction() {// ����� �� ������ ��� �� ������ ������ ���
		num = 0;
		den = 1;
	}

	public String toString() {// ���������� �� ������
		if (den == 0)
			return "NaN";
		if (den == 1)
			return Long.toString(num);
		return num + "/" + den;

	}

	public Fraction add(Fraction g) {// ��������
		return new Fraction(num * g.den + g.num * den, den * g.den);
	}

	public Fraction mul(Fraction g) {// ���������
		return new Fraction(num * g.num, den * g.den);
	}

	public Fraction sub(Fraction g) {// !!!! ������ ��� �� ������
		return new Fraction(num * g.den - g.num * den, g.den * den);
	}

	public Fraction Div(Fraction g) {
		if (g.num == 0)
			return new Fraction(1, 0);
		return new Fraction(num * g.den, den * g.num);
	}

	public String malkoigolqmo(Fraction g, Fraction f) {
long aa=g.num;
long b=f.num;
		String a = "";
		if (g.den == f.den) {
			if (g.num > f.num)
			return	a = g + ">" + f;
			else if (g.num < f.num)
			return	a = g + "<" + f;
			else
			return	a = g + "="+ f;
		}
		aa=aa*f.den;
		b=b*g.den;
		if(aa>b) return a=g+">"+f;
		else if(aa<b) return a=g+"<"+f;
		else return a=g+"="+f;

	}
}
