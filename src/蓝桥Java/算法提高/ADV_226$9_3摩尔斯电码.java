package ����Java.�㷨���;
import java.util.Scanner;
/*
  �㷨��� 9-3Ħ��˹����  
ʱ�����ƣ�1.0s   �ڴ����ƣ�256.0MB
   
��������
����Ħ��˹�������롣���������ֽ̲ĵ�213ҳ����6.5��Ҫ������Ħ��˹�룬����Ӣ�ġ��벻Ҫʹ��"zylib.h"��ֻ��ʹ�ñ�׼�⺯������' * '��ʾ' . '���м�ո���' | '��ʾ��ֻת���ַ���

����Ħ��˹�붨�����http://baike.baidu.com/view/84585.htm?fromId=253988��

��ʾ
������Ƚ�������ʱ����������EOF��β�ģ������ǻ��з�����EOF����һ���ַ�������EOF��β����һ��ͨ�׵����Ͻ���˵��������˿���ͨ�����·�ʽ֮һ��ȡ���룺

����1. һ�ζ��������ַ������ٽ��к���������

����2. ʹ��getchar��scanfһ�ζ���һ���ַ���ͨ�����ǵķ���ֵ�ж����������
�������

 */
public class ADV_226$9_3Ħ��˹���� {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		scanner.close();
		StringBuffer strBuff = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '|') {
				check(strBuff);
				strBuff = new StringBuffer();
			} else {
				strBuff.append(str.charAt(i));
			}
		}
		check(strBuff);
	}

	private static void check(StringBuffer strBuff) {
		// System.err.println(strBuff);
		String str = strBuff.toString();
		switch (strBuff.length()) {
		case 1:
			if (str.equals("-")) {
				System.out.print('t');
			} else {
				System.out.print('e');
			}
			break;
		case 2:
			if (str.equals("*-")) {
				System.out.print('a');
			} else {
				if (str.equals("**")) {
					System.out.print('i');
				} else {
					if (str.equals("--")) {
						System.out.print('m');
					} else {
						if (str.equals("-*")) {
							System.out.print('n');
						}
					}
				}
			}
			break;
		case 3:
			if (str.equals("-**")) {
				System.out.print('d');
			} else {
				if (str.equals("--*")) {
					System.out.print('g');
				} else {
					if (str.equals("-*-")) {
						System.out.print('k');
					} else {
						if (str.equals("---")) {
							System.out.print("o");
						} else {
							if (str.equals("*-*")) {
								System.out.print('r');
							} else {
								if (str.equals("***")) {
									System.out.print('s');
								} else {
									if (str.equals("**-")) {
										System.out.print('u');
									} else {
										if (str.equals("*--")) {
											System.out.print('w');
										}
									}
								}
							}
						}
					}
				}
			}
			break;
		case 4:
			if (str.equals("-***")) {
				System.out.print('b');
			} else {
				if (str.equals("-*-*")) {
					System.out.print('c');
				} else {
					if (str.equals("**-*")) {
						System.out.print('f');
					} else {
						if (str.equals("****")) {
							System.out.print('h');
						} else {
							if (str.equals("*---")) {
								System.out.print('j');
							} else {
								if (str.equals("*-**")) {
									System.out.print('l');
								} else {
									if (str.equals("*--*")) {
										System.out.print('p');
									} else {
										if (str.equals("--*-")) {
											System.out.print('q');
										} else {
											if (str.equals("***-")) {
												System.out.print('v');
											} else {
												if (str.equals("-**-")) {
													System.out.print('x');
												} else {
													if (str.equals("-*--")) {
														System.out.print('y');
													} else {
														if (str.equals("--**")) {
															System.out.print('z');
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			break;
		default:
			break;
		}
	}

}
