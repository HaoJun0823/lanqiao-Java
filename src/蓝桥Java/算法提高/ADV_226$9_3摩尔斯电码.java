package 蓝桥Java.算法提高;
import java.util.Scanner;
/*
  算法提高 9-3摩尔斯电码  
时间限制：1.0s   内存限制：256.0MB
   
问题描述
　　摩尔斯电码破译。类似于乔林教材第213页的例6.5，要求输入摩尔斯码，返回英文。请不要使用"zylib.h"，只能使用标准库函数。用' * '表示' . '，中间空格用' | '表示，只转化字符表。

　　摩尔斯码定义见：http://baike.baidu.com/view/84585.htm?fromId=253988。

提示
　　清橙进行评测时，输入是以EOF结尾的，而不是换行符。（EOF不是一个字符，“以EOF结尾”是一种通俗但不严谨的说法。）因此可以通过以下方式之一获取输入：

　　1. 一次读入整行字符串，再进行后续解析。

　　2. 使用getchar或scanf一次读入一个字符，通过它们的返回值判断输入结束。
样例输出

 */
public class ADV_226$9_3摩尔斯电码 {

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
