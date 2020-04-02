package _05_horoscope;

import javax.swing.JOptionPane;

public class horoscope {
public static void main(String[] args) {
	

String user =	JOptionPane.showInputDialog("Whats your star sign");
	if (user.equalsIgnoreCase("Leo")) {
		JOptionPane.showMessageDialog(null, "You are a Hamdsome, Smart, Athletic, Strong, Powerful, Great, Amaising person. But seariusly Strengths: Creative, passionate, generous, warm-hearted, cheerful, humorous\n" + 
				
				"Weaknesses: Arrogant, stubborn, self-centered, lazy, inflexible\n" + 
				
				"Leo likes: Theater, taking holidays, being admired, expensive things, bright colors, fun with friends\n" + 
				
				"Leo dislikes: Being ignored, facing difficult reality, not being treated like a king or queen\n" + 
				
				"People born under the sign of Leo are natural born leaders. They are dramatic, creative, self-confident, dominant and extremely difficult to resist, able to achieve anything they want to in any area of life they commit to. There is a specific strength to a Leo and their \"king of the jungle\" status. Leo often has many friends for they are generous and loyal. Self-confident and attractive, this is a Sun sign capable of uniting different groups of people and leading them as one towards a shared cause, and their healthy sense of humor makes collaboration with other people even easier.\n" + 
			
				"Leo belongs to the element of Fire, just like Aries and Sagittarius. This makes them warmhearted, in love with life, trying to laugh and have a good time. Able to use their mind to solve even the most difficult problems, they will easily take initiative in resolving various complicated situations. Ruled by the Sun, Leo worships this fiery entity in the sky, quite literally as well as metaphorically. They are in search for self-awareness and in constant growth of ego. Aware of their desires and personality, they can easily ask for everything they need, but could just as easily unconsciously neglect the needs of other people in their chase for personal gain or status. When a Leo representative becomes too fond and attached to their achievements and the way other people see them, they become an easy target, ready to be taken down.\n" + 
			
				"Leo - the Lion in the Cave The story of the Lion always speaks of bravery. This is an animal fearless and impossible to challenge, hurt or destroy, their only weaknesses being fear and aggression towards those they confront. Living in a cave, a Lion always needs to have one, nesting and finding comfort in hard times. However, they should never stay there for long. With their head high, they have to face others with dignity and respect, never raising a voice, a hand, or a weapon, bravely walking through the forest they rule.\n" + 
				"");}
	
		else	if (user.equalsIgnoreCase("Aries")) {
		JOptionPane.showMessageDialog(null," Strengths: Courageous, determined, confident, enthusiastic, optimistic, honest, passionate\n" + 
			
			"Weaknesses: Impatient, moody, short-tempered, impulsive, aggressive\n" + 
			
			"Aries likes: Comfortable clothes, taking on leadership roles, physical challenges, individual sports\n" + 

			"Aries dislikes: Inactivity, delays, work that does not use one's talents\n" + 
			
			"As the first sign in the zodiac, the presence of Aries always marks the beginning of something energetic and turbulent. They are continuously looking for dynamic, speed and competition, always being the first in everything - from work to social gatherings. Thanks to its ruling planet Mars and the fact it belongs to the element of Fire (just like Leo and Sagittarius), Aries is one of the most active zodiac signs. It is in their nature to take action, sometimes before they think about it well.\n" + 
		
			"The Sun in such high dignity gives them excellent organizational skills, so you'll rarely meet an Aries who isn't capable of finishing several things at once, often before lunch break! Their challenges show when they get impatient, aggressive and vent anger pointing it to other people. Strong personalities born under this sign have a task to fight for their goals, embracing togetherness and teamwork through this incarnation.\n" + 
		
			"Aries rules the head and leads with the head, often literally walking head first, leaning forwards for speed and focus. Its representatives are naturally brave and rarely afraid of trial and risk. They possess youthful strength and energy, regardless of their age and quickly perform any given tasks.\n" + 
		 
			"Aries - the Flying Ram Guided by the story of the Golden Fleece, an Aries is ready to be the hero of the day, fly away and carry many endangered, powerless people on their back. The power of the ram is carried on his back, for he is the gold itself, shiny and attractive to those ready for betrayal. The story of glory that isn't easy to carry is in these two horns, and if this animal doesn't get shorn, allowing change and giving someone a warm sweater, they won't have much to receive from the world. Each Aries has a task to share their position, power, gold, or physical strength with other people willingly, or the energy will be stopped in its natural flow, fear will take over, and the process of giving and receiving will hold balance at zero. But your not a Leo your a weirdo");}
		else	if (user.equalsIgnoreCase("Sagittarius")) {
					JOptionPane.showMessageDialog(null,
			
			"you're a Sagittarius Harry");}
				
				else if (user.equalsIgnoreCase("Scorpio")) {
					JOptionPane.showMessageDialog(null, "GET OUT MY FACE NOW!!!!!!");
				}
		
		
					else { JOptionPane.showMessageDialog(null, "your not a Leo so It doesent matter");
				}
		
	










}
}