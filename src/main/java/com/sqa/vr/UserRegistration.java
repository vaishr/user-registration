/**
 *   File Name: UserRegistration.java<br>
 *
 *   Reddy, Vaishnavi<br>
 *   Created: Oct 10, 2016
 *   
 */

package com.sqa.vr;

import com.sqa.vr.helpers.*;

/**
 * UserRegistration //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Reddy, Vaishnavi
 * @version     1.0.0
 * @since       1.0
 *
 */
public class UserRegistration {

	/**
	 * @param args
	 */
	private static String[] names;
	private static int[] ages;
	private static char[] genders;
	private static String[] jobTitles;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int usersCount = RequestInput.getInt("how many users would you like to enter into the system? ");
		names = new String[usersCount];
		ages = new int[usersCount];
		genders = new char[usersCount];
		jobTitles = new String[usersCount];
		
		for (int i = 0; i < usersCount; i++) {
			System.out.println("User Details for User " + (i+1));
			names[i] = RequestInput.getString("What is user #" + (i+1) + "'s name?");
			ages[i] = RequestInput.getInt("What is user #" + (i+1) + "'s age?");
			genders[i] = RequestInput.getChar("What is user#"  + (i+1) + "'s gender?\n Enter 'F' for female, 'M' for male, and 'U' for non-binary or prefer not to answer", 'M', 'F', 'U');
			if (genders[i] == 'M') {
				jobTitles[i] = RequestInput.getString("What does he do for a living ?");
				}
				else if (genders[i] == 'F') {
					jobTitles[i] = RequestInput.getString("What does she do for a living ?");
				}
				else {
					jobTitles[i] = RequestInput.getString("What do they do for a living ?");
				}
			}
			
		for (int i = 0; i < usersCount; i++) {
			System.out.println("\tName: " + names[i]);
			System.out.println("\tGender: " + genders[i]);
			System.out.println("\tJobTitle:" + jobTitles[i]);
		}
			
		}
		
	}

