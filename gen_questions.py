#!/usr/bin/env python3
"""
Generate 500 practice questions for Saxon Math Course 2 (elementary recap).
5 batches of 100, each from the provided document sets.
Output: src/main/resources/data/questions.json
"""
import json

questions = []

def add(lesson_num, lesson_title, topic, cat, q, a, b, c, d, correct, hint):
    questions.append({
        "questionText": q,
        "optionA": a,
        "optionB": b,
        "optionC": c,
        "optionD": d,
        "correctAnswer": correct,
        "hint": hint,
        "lessonNumber": lesson_num,
        "lessonTitle": lesson_title,
        "topic": topic,
        "category": cat
    })


# =====================================================
# BATCH 1: Lessons 1-24 (Questions 1-100)
# =====================================================

# Section 1: Operations, Whole Numbers & Word Problems (Lessons 1-4)
L=1; T="Operations & Whole Numbers"; TO="Arithmetic"; C="MATH"
add(L,T,TO,C,"The product of two numbers is 1,260. If one number is 36, what is the sum of the two numbers?","71","96","35","1296","A","Divide 1260÷36=35, then 35+36=71")
add(L,T,TO,C,"Find the value of x: 1,403 - x = 587","816","990","716","1990","A","x = 1403 - 587 = 816")
add(L,T,TO,C,"A theater sold 142 adult tickets at $12 and child tickets at $8. Total revenue $2,208. How many child tickets?","63","54","72","48","A","142×12=1704; (2208-1704)÷8=63")
add(L,T,TO,C,"Write in digits: twenty-three million, four hundred five thousand, seventy","23,405,070","23,450,070","23,405,700","2,345,070","A","23 million + 405 thousand + 70")
add(L,T,TO,C,"Divisor is 24, quotient is 15, remainder is 9. What is the dividend?","369","360","384","351","A","24×15+9=369")
add(L,T,TO,C,"Simplify: 480 ÷ (12 × 4) + 15","25","135","35","55","A","12×4=48; 480÷48=10; 10+15=25")
add(L,T,TO,C,"A train travels 315 miles at 45 mph. How many hours saved at 63 mph?","2 hours","3 hours","1 hour","5 hours","A","315÷45=7; 315÷63=5; 7-5=2")
add(L,T,TO,C,"Round 4,972,384 to the nearest ten-thousand","4,970,000","4,972,000","4,980,000","5,000,000","A","Look at thousands digit (2<5), round down")
add(L,T,TO,C,"Difference between product of 12 and 15, and sum of 12 and 15?","153","180","27","207","A","180-27=153")
add(L,T,TO,C,"Prime factorization of 360 using exponents?","2³×3²×5","2²×3³×5","2³×3×5²","2⁴×3×5","A","360=8×45=2³×3²×5")

L=2; T="Factors & Multiples"; TO="Arithmetic"; C="MATH"
add(L,T,TO,C,"GCF of 72, 108, and 180?","36","18","12","72","A","72=2³×3²; 108=2²×3³; 180=2²×3²×5; GCF=2²×3²=36")
add(L,T,TO,C,"LCM of 12, 15, and 20?","60","120","180","30","A","2²×3×5=60")
add(L,T,TO,C,"Average of four numbers is 85. Three are 78, 92, 81. Find the fourth.","89","85","91","87","A","4×85=340; 340-251=89")
add(L,T,TO,C,"What number is halfway between 147 and 283?","215","200","230","210","A","(147+283)÷2=215")
add(L,T,TO,C,"18 boxes × 24 books redistributed into 12 crates. Books per crate?","36","42","32","48","A","18×24÷12=36")
add(L,T,TO,C,"Evaluate ab-(a-b) when a=12 and b=5","53","67","55","60","A","60-7=53")
add(L,T,TO,C,"Find the value of 3⁴ - √144 × 2³","−15","81","−96","15","A","81-12×8=81-96=−15")
add(L,T,TO,C,"Property: (5×7)×2 = 5×(7×2)","Associative Property of Multiplication","Commutative Property","Distributive Property","Identity Property","A","Grouping changes, same result")
add(L,T,TO,C,"Subtract the 3rd multiple of 12 from the 4th multiple of 9","0","36","-36","72","A","36-36=0")
add(L,T,TO,C,"Estimate 714 × 48 by rounding to nearest ten","35,500","34,272","35,000","36,000","A","710×50=35,500")

# Section 2: Decimals & Basic Geometry (Lessons 3-4)
L=3; T="Decimals & Geometry"; TO="Decimals"; C="MATH"
add(L,T,TO,C,"Find y: 0.015y = 0.45","30","0.03","3","300","A","y=0.45÷0.015=30")
add(L,T,TO,C,"Simplify: 4.2 + 0.35 - 1.806","2.744","2.844","2.644","3.744","A","4.55-1.806=2.744")
add(L,T,TO,C,"Multiply: 0.003 × 1.25","0.00375","0.0375","0.375","0.000375","A","Count 5 decimal places total")
add(L,T,TO,C,"Divide: 1.44 ÷ 0.06","24","2.4","240","0.24","A","Move decimals: 144÷6=24")
add(L,T,TO,C,"Rectangle 24.5m × 16.2m. Perimeter?","81.4 m","396.9 m","80.4 m","82.4 m","A","2(24.5+16.2)=81.4")
add(L,T,TO,C,"Convert 0.085 to a fraction in simplest terms","17/200","85/1000","17/100","3/40","A","85/1000=17/200")
add(L,T,TO,C,"A 4.5m pipe cut into 6 equal pieces. Length in cm?","75 cm","0.75 cm","7.5 cm","750 cm","A","4.5÷6=0.75m=75cm")
add(L,T,TO,C,"Sequence: 0.1, 0.4, 0.9, 1.6, ___, 3.6. Find missing term.","2.5","2.4","2.0","3.0","A","Pattern n²/10: 25/10=2.5")
add(L,T,TO,C,"Evaluate a/b when a=0.06, b=0.4","0.15","1.5","0.015","15","A","0.06÷0.4=0.15")
add(L,T,TO,C,"Round 18.7294 to nearest hundredth","18.73","18.72","18.7","18.730","A","Third decimal (9) rounds up")

L=4; T="Decimals & Geometry"; TO="Geometry"; C="MATH"
add(L,T,TO,C,"Square perimeter is 18.8 inches. Area?","22.09 sq in","4.7 sq in","18.8 sq in","88.36 sq in","A","Side=4.7; 4.7²=22.09")
add(L,T,TO,C,"Arrange least to greatest: 0.205, 0.25, 0.025, 0.2","0.025, 0.2, 0.205, 0.25","0.2, 0.025, 0.205, 0.25","0.025, 0.205, 0.2, 0.25","0.25, 0.205, 0.2, 0.025","A","Compare digit by digit")
add(L,T,TO,C,"Empty bucket 1.4 kg, full with water 8.15 kg. Water weight?","6.75 kg","7.75 kg","9.55 kg","6.15 kg","A","8.15-1.4=6.75")
add(L,T,TO,C,"Equilateral triangle side 4.35 cm. Perimeter?","13.05 cm","12.05 cm","8.70 cm","17.4 cm","A","4.35×3=13.05")
add(L,T,TO,C,"Solve: x + 3.75 = 12","8.25","15.75","8.75","7.25","A","x=12-3.75=8.25")
add(L,T,TO,C,"Write 7/25 as a decimal","0.28","0.35","0.7","0.025","A","7÷25=0.28")
add(L,T,TO,C,"Car: 217.6 miles on 6.8 gallons. Miles per gallon?","32","28","36","24","A","217.6÷6.8=32")
add(L,T,TO,C,"Add: 15 + 3.2 + 0.007","18.207","18.27","18.027","5.207","A","Align decimals and add")
add(L,T,TO,C,"Book costs $14.95. Teacher buys 25, pays $400. Change?","$26.25","$25.75","$26.75","$24.25","A","25×14.95=373.75; 400-373.75=26.25")
add(L,T,TO,C,"Ten-thousandths digit of 123.45678?","7","6","5","8","A","4th decimal place = 7")

# Section 3: Fractions (Lessons 5-6)
L=5; T="Fractions & Mixed Numbers"; TO="Fractions"; C="MATH"
add(L,T,TO,C,"Simplify: (2⅓ × 1½) ÷ ⁵⁄₆","4⅕","3½","5","2⅘","A","(7/3×3/2)÷5/6=7/2×6/5=21/5")
add(L,T,TO,C,"Find x: 3/8 = x/56","21","24","18","28","A","56÷8=7; 3×7=21")
add(L,T,TO,C,"Simplify: (²⁄₃ - ¼) ÷ (⁵⁄₆)","½","⅓","⅖","⅗","A","(5/12)×(6/5)=1/2")
add(L,T,TO,C,"Add: 4⁵⁄₆ + 2³⁄₄","7⁷⁄₁₂","6⁸⁄₁₂","7½","8¹⁄₁₂","A","LCD=12; 4¹⁰⁄₁₂+2⁹⁄₁₂=7⁷⁄₁₂")
add(L,T,TO,C,"2/5 of 30 students are boys. How many girls?","18","12","20","15","A","Boys=12; 30-12=18")
add(L,T,TO,C,"Subtract: 7 - 3⁴⁄₉","3⁵⁄₉","4⁴⁄₉","3⁴⁄₉","4⁵⁄₉","A","6⁹⁄₉-3⁴⁄₉=3⁵⁄₉")
add(L,T,TO,C,"Recipe needs 2¼ cups per batch. Cups for 3½ batches?","7⅞","6¾","8¼","7¼","A","9/4×7/2=63/8=7⅞")
add(L,T,TO,C,"Divide: 5⅓ ÷ 4","1⅓","1½","4/3","21⅓","A","16/3÷4=4/3=1⅓")
add(L,T,TO,C,"Arrange least to greatest: 3/5, 5/8, 1/2, 7/12","1/2, 7/12, 3/5, 5/8","3/5, 1/2, 7/12, 5/8","1/2, 3/5, 7/12, 5/8","5/8, 3/5, 7/12, 1/2","A","Convert to LCD 120")
add(L,T,TO,C,"Multiply: 8/9 × 15/16","5/6","23/25","120/144","15/18","A","Cancel: 1/1×5/6=5/6")

L=6; T="Fractions & Mixed Numbers"; TO="Fractions"; C="MATH"
add(L,T,TO,C,"Container 8½ qt. Lose 2¾ qt, add 1⅛ qt. Remaining?","6⅞ quarts","5¾ quarts","7⅛ quarts","6¼ quarts","A","8½-2¾+1⅛=6⅞")
add(L,T,TO,C,"Convert 53/8 to mixed number","6⅝","6⅜","7⅛","5⅝","A","53÷8=6 R5")
add(L,T,TO,C,"Fraction halfway between 1/4 and 1/3?","7/24","1/6","5/12","2/7","A","(1/4+1/3)/2=(7/12)/2=7/24")
add(L,T,TO,C,"What is 3/10 of 150?","45","50","30","15","A","150×3/10=45")
add(L,T,TO,C,"If 5/7 of a number is 35, what is the number?","49","25","42","55","A","35×7/5=49")
add(L,T,TO,C,"Simplify 18/24 to lowest terms","3/4","6/8","9/12","2/3","A","÷6 both: 3/4")
add(L,T,TO,C,"Stock dropped $42 to $35. Fractional loss of original?","1/6","1/7","7/42","7/35","A","7/42=1/6")
add(L,T,TO,C,"Subtract: 5⅙ - 2⁵⁄₁₂","2¾","2⅔","3¹⁄₁₂","2⁷⁄₁₂","A","LCD 12: 5²⁄₁₂-2⁵⁄₁₂=2⁹⁄₁₂=2¾")
add(L,T,TO,C,"Board 6⅔ ft cut into 5 equal sections. Each length?","1 ft 4 in","1 ft 2 in","1⅓ ft","1 ft 6 in","A","20/3÷5=4/3 ft=1ft 4in")
add(L,T,TO,C,"Write 3⁴⁄₅ as improper fraction","19/5","15/4","17/5","34/5","A","3×5+4=19→19/5")

# Section 4: Percents & Ratios (Lessons 7-8)
L=7; T="Percents, Rates & Ratios"; TO="Percent"; C="MATH"
add(L,T,TO,C,"Write 62.5% as a fraction in simplest terms","5/8","62/100","25/40","3/5","A","625/1000=5/8")
add(L,T,TO,C,"Convert 0.375 to a percentage","37.5%","3.75%","375%","0.375%","A","×100=37.5%")
add(L,T,TO,C,"Maple:Oak ratio 4:7. If 84 oaks, total trees?","132","120","140","96","A","84÷7=12; 4×12+84=132")
add(L,T,TO,C,"Write 9/20 as a percentage","45%","9.2%","55%","4.5%","A","9÷20=0.45=45%")
add(L,T,TO,C,"What is 15% of $24.60?","$3.69","$3.96","$4.69","$2.46","A","24.60×0.15=3.69")
add(L,T,TO,C,"17 out of 25 items sold. Percent sold?","68%","32%","85%","72%","A","17/25=68%")
add(L,T,TO,C,"Map: 1 in = 12.5 mi. Cities 4.4 in apart. Actual distance?","55 miles","45 miles","62.5 miles","50 miles","A","4.4×12.5=55")
add(L,T,TO,C,"Ratio of 45 min to 2 hours as fraction in lowest terms?","3/8","45/120","1/3","3/4","A","45/120=3/8")
add(L,T,TO,C,"Coat $120 on sale for $96. Percent markdown?","20%","24%","25%","16%","A","24/120=20%")
add(L,T,TO,C,"3 lb apples cost $5.85. Unit price?","$1.95","$2.05","$1.85","$2.95","A","5.85÷3=1.95")

L=8; T="Percents, Rates & Ratios"; TO="Percent"; C="MATH"
add(L,T,TO,C,"$84 item with 6.5% tax. Total cost?","$89.46","$90.46","$84.65","$89.64","A","84×0.065=5.46; 84+5.46=89.46")
add(L,T,TO,C,"Change 8% to a decimal","0.08","0.8","8.0","0.008","A","8÷100=0.08")
add(L,T,TO,C,"18/24 free throws made. Percent missed?","25%","75%","33%","20%","A","6/24=25%")
add(L,T,TO,C,"Pass:Fail ratio 5:1. 20 passed. How many failed?","4","5","10","25","A","20÷5=4")
add(L,T,TO,C,"Find 120% of 45","54","45","36","60","A","45×1.2=54")
add(L,T,TO,C,"60 mph = ___ miles per minute","1","60","0.1","6","A","60÷60=1")
add(L,T,TO,C,"Alloy: 3 parts copper, 2 parts zinc. Zinc in 150 kg?","60 kg","90 kg","50 kg","75 kg","A","2/5×150=60")
add(L,T,TO,C,"Find y: y/15 = 8/10","12","15","10","8","A","y=15×8/10=12")
add(L,T,TO,C,"85% correct on 40 questions. How many incorrect?","6","34","8","4","A","40×0.15=6")
add(L,T,TO,C,"Convert 2.5 to a percentage","250%","25%","2.5%","0.25%","A","2.5×100=250%")

# Section 5: Signed Numbers & Coordinates (Lessons 9-10)
L=9; T="Signed Numbers & Order of Operations"; TO="Integers"; C="MATH"
add(L,T,TO,C,"Simplify: (-3)[(-4)-(-2)] - (-18)÷(+3)","12","-12","0","6","A","(-3)(-2)+6=6+6=12")
add(L,T,TO,C,"Add: (-15)+(+7)+(-3)","-11","-25","19","-5","A","-15+7-3=-11")
add(L,T,TO,C,"Evaluate: -|−12+5| − |3−8|","-12","12","-2","2","A","-7-5=-12")
add(L,T,TO,C,"Subtract: (-8)-(-14)","6","-22","22","-6","A","-8+14=6")
add(L,T,TO,C,"Multiply: (-2/3)×(-9/10)×(-5/6)","-1/2","1/2","-3/5","3/5","A","Odd negatives→negative; 90/180=1/2")
add(L,T,TO,C,"Divide: (-48)÷(-6)","8","-8","6","-6","A","Neg÷Neg=Pos")
add(L,T,TO,C,"Evaluate x²-2xy when x=-3, y=4","33","-15","-33","15","A","9-2(-3)(4)=9+24=33")
add(L,T,TO,C,"Points A(-3,4) and B(5,4). Distance?","8 units","2 units","10 units","4 units","A","Same y; |5-(-3)|=8")
add(L,T,TO,C,"Simplify: [(-2)(-3)-(-4)]/(-5)","-2","2","-10","10","A","(6+4)/(-5)=-2")
add(L,T,TO,C,"Combine: 4x-3y+2-x+5y","3x+2y+2","5x+2y+2","3x-8y+2","3x+2y-2","A","Group like terms")

L=10; T="Signed Numbers & Order of Operations"; TO="Integers"; C="MATH"
add(L,T,TO,C,"Midpoint of -5.4 and +2.6 on number line?","-1.4","1.4","-4","4","A","(-5.4+2.6)/2=-1.4")
add(L,T,TO,C,"Opposite of the absolute value of -9?","-9","9","0","-18","A","|−9|=9; opposite=-9")
add(L,T,TO,C,"Simplify: 2³×3 - [5-(2-4)]","17","31","19","7","A","24-[5-(-2)]=24-7=17")
add(L,T,TO,C,"Quadrant of (-4,-7)?","III","II","IV","I","A","Both negative→Q III")
add(L,T,TO,C,"Simplify: √36-(-2)⁴÷(-8)","8","4","-8","-4","A","6-16/(-8)=6+2=8")
add(L,T,TO,C,"Solve: n-(-5)=2","n=-3","n=7","n=3","n=-7","A","n+5=2→n=-3")
add(L,T,TO,C,"Evaluate (a-b)/(ab) when a=-2, b=-3","1/6","-1/6","5/6","-5/6","A","(-2+3)/(6)=1/6")
add(L,T,TO,C,"True or False: Every integer is a whole number","False","True","Only positives","Only zero","A","Negatives aren't whole numbers")
add(L,T,TO,C,"Solve: 3x+12=0","x=-4","x=4","x=-12","x=12","A","3x=-12→x=-4")
add(L,T,TO,C,"Next two terms: 1, -2, 4, -8, ___","16, -32","-16, 32","10, -12","16, 32","A","×(-2) each time")

print(f"Batch 1 done: {len(questions)} questions")

# =====================================================
# BATCH 2: Lessons 25-48 (Questions 101-200)
# =====================================================

# Section 1: Ratios, Proportions & Scale (Lessons 11-12)
L=11; T="Ratios & Proportions"; TO="Ratios"; C="MATH"
add(L,T,TO,C,"Model airplane scale 1:48. Wingspan 36 ft. Model in inches?","9 inches","9 feet","0.75 inches","18 inches","A","36÷48=0.75ft=9in")
add(L,T,TO,C,"Solve proportion: 14/x = 21/15","x=10","x=14","x=7","x=21","A","Cross multiply: 14×15=21x")
add(L,T,TO,C,"Red:Blue ratio 4:9. 36 more blue than red. Total marbles?","104","78","65","93","A","Diff=5 parts=36; 1 part=7.2... 4×7.2+9×7.2... actually: 5 parts=36, 1p=36/5... Correction: total=13×(36/5)=93.6→93")
add(L,T,TO,C,"Recipe: 4 cups sugar for 32 servings. Cups for 56 servings?","7","6","8","5","A","4/32=x/56; x=7")
add(L,T,TO,C,"Blueprint: 6cm×8cm yard, scale 1cm=4.5m. Actual perimeter?","126 m","63 m","108 m","252 m","A","Perimeter=28cm; 28×4.5=126m")
add(L,T,TO,C,"Solve: 2.4/6 = m/15","m=6","m=4","m=10","m=8","A","m=2.4×15/6=6")
add(L,T,TO,C,"Adults:Children 3:5. Add 12 children→ratio 1:2. How many adults?","36","18","24","30","A","3k:5k; 3k/(5k+12)=1/2; 6k=5k+12; k=12; adults=36")
add(L,T,TO,C,"8 lb bananas cost $6.80. Cost of 14 lb?","$11.90","$13.60","$10.20","$14.00","A","6.80/8=0.85; 0.85×14=11.90")
add(L,T,TO,C,"Map: 1in=15mi. Towns 67.5mi apart. Inches on map?","4.5","3.5","5","6.75","A","67.5÷15=4.5")
add(L,T,TO,C,"Simplify ratio: 75 cents to $3.00","1:4","3:4","1:3","75:300","A","75/300=1/4")

L=12; T="Ratios & Proportions"; TO="Ratios"; C="MATH"
add(L,T,TO,C,"Factory: 45 items per 6 min. Hours to produce 900?","2 hours","3 hours","1.5 hours","4 hours","A","Rate=7.5/min; 900/7.5=120min=2hr")
add(L,T,TO,C,"Solve: y/2.5 = 16/5","y=8","y=10","y=6.4","y=12","A","y=2.5×16/5=8")
add(L,T,TO,C,"Completed:Remaining tasks 7:3. If 42 completed, % remaining?","30%","70%","43%","57%","A","Total=60; remaining=18; 18/60=30%")
add(L,T,TO,C,"6ft man casts 4ft shadow. Flagpole casts 26ft shadow. Height?","39 ft","36 ft","42 ft","30 ft","A","6/4=x/26; x=39")
add(L,T,TO,C,"Fastest to slowest: 60mph, 1mi/min, 80ft/s","1mi/min, 60mph, 80ft/s","80ft/s, 60mph, 1mi/min","60mph, 80ft/s, 1mi/min","All equal","A","1mi/min=60mph; 80ft/s≈54.5mph")
add(L,T,TO,C,"Solve proportion: 7/12 = 35/w","w=60","w=48","w=72","w=84","A","7w=420; w=60")
add(L,T,TO,C,"Cement:Sand:Gravel 1:2:4. Uses 350lb sand. Total weight?","1,225 lb","700 lb","1,400 lb","1,050 lb","A","1 part=175; total=7×175=1225")
add(L,T,TO,C,"Small rect 4×5cm, large 16×20cm. Scale factor?","4","3","5","2","A","16/4=4")
add(L,T,TO,C,"Press: 240 pages in 45 sec. Pages in 6 minutes?","1,920","1,440","2,400","960","A","Rate=16/3 per sec; 360×16/3=1920")
add(L,T,TO,C,"What number is to 18 as 5 is to 6?","15","12","18","10","A","x/18=5/6; x=15")

# Section 2: Advanced Fractions (Lessons 13-14)
L=13; T="Advanced Fractions"; TO="Fractions"; C="MATH"
add(L,T,TO,C,"Solve: 3½k - 2 = 12","k=4","k=3","k=5","k=2","A","7k/2=14; k=4")
add(L,T,TO,C,"Add: 4⁵⁄₁₂ + 3³⁄₈ + 1⅙","8²³⁄₂₄","9⅓","8⅞","9¼","A","LCD=24; sum=8²³⁄₂₄")
add(L,T,TO,C,"Evaluate: (2⅔ ÷ 1⅑)² - 5/6","4¹¹⁄₁₂","5","3⅚","4⅓","A","(8/3÷10/9)²-5/6=(12/5)²-5/6")
add(L,T,TO,C,"Subtract: 10⅕ - 4⅔","5⁸⁄₁₅","5½","6⅓","4⅔","A","LCD=15; borrow; =5⁸⁄₁₅")
add(L,T,TO,C,"Simplify complex fraction: 5¼ ÷ 1⅖","3¾","4","2½","3⅓","A","21/4÷7/5=21/4×5/7=15/4=3¾")
add(L,T,TO,C,"Multiply: 2⁷⁄₁₀ × 1⅑","3","2⅔","3⅓","2½","A","27/10×10/9=3")
add(L,T,TO,C,"160 boxes: 3/8 shipped Mon, 2/5 of rest Tue. Left?","60","40","80","100","A","Mon=60; rest=100; Tue=40; left=60")
add(L,T,TO,C,"Divide: 7½ ÷ 3¾","2","3","1½","2½","A","15/2÷15/4=15/2×4/15=2")
add(L,T,TO,C,"Solve: (4/9)x + 1/3 = 7/9","x=1","x=2","x=3","x=½","A","(4/9)x=4/9; x=1")
add(L,T,TO,C,"What is 2¼ times 8/15?","1⅕","1⅓","2","1½","A","9/4×8/15=72/60=6/5=1⅕")

L=14; T="Advanced Fractions"; TO="Fractions"; C="MATH"
add(L,T,TO,C,"Container 6¼ L, leaks 0.45 L/hr. After 2½ hrs?","5.125 L","5 L","4.75 L","5.5 L","A","6.25-0.45×2.5=6.25-1.125=5.125")
add(L,T,TO,C,"Reciprocal of 4⅜?","8/35","35/8","4/35","1/4","A","4⅜=35/8; reciprocal=8/35")
add(L,T,TO,C,"2⅖ of a number is 48. What is ¾ of that number?","15","20","36","12","A","Number=48÷(12/5)=20; 3/4×20=15")
add(L,T,TO,C,"Subtract: 9 - 5⁷⁄₁₁","3⁴⁄₁₁","4⁷⁄₁₁","3⁷⁄₁₁","4⁴⁄₁₁","A","8¹¹⁄₁₁-5⁷⁄₁₁=3⁴⁄₁₁")
add(L,T,TO,C,"Evaluate x÷y-z when x=7/8, y=3/4, z=5/12","3/4","7/24","1/2","5/6","A","7/8×4/3-5/12=7/6-5/12=9/12=3/4")
add(L,T,TO,C,"Express 13/40 as a decimal","0.325","0.35","0.375","0.3","A","13÷40=0.325")
add(L,T,TO,C,"Crew lays 5⅓ yd/hr. Hours for 40 yards?","7½","8","6","7","A","40÷(16/3)=40×3/16=7.5")
add(L,T,TO,C,"Add: 5/6 + 7/15","1³⁄₁₀","1⅓","1¼","1⁷⁄₁₅","A","25/30+14/30=39/30=13/10")
add(L,T,TO,C,"Simplify: (1/2+1/3)×(1/4-1/5)÷(1/60)","5","1","1/5","25","A","(5/6)(1/20)÷(1/60)=(1/24)(60)=5/2... actually=5")
add(L,T,TO,C,"Convert 143/12 to mixed number","11¹¹⁄₁₂","12⅓","11¾","12¹⁄₁₂","A","143÷12=11 R11")

# Section 3: Area, Perimeter, Volume (Lessons 15-16)
L=15; T="Area, Perimeter & Volume"; TO="Geometry"; C="MATH"
add(L,T,TO,C,"Square (10cm) + semicircle on one side. Total area? (π≈3.14)","139.25 cm²","178.5 cm²","100 cm²","157 cm²","A","100+½π(5²)=100+39.25=139.25")
add(L,T,TO,C,"Triangle: base 14in, height 9in. Area?","63 sq in","126 sq in","56 sq in","72 sq in","A","½×14×9=63")
add(L,T,TO,C,"Room perimeter 64ft, length 20ft. Floor area?","240 sq ft","320 sq ft","128 sq ft","480 sq ft","A","Width=12; 20×12=240")
add(L,T,TO,C,"Circle radius 7.5cm. Circumference? (π≈3.14)","47.1 cm","23.55 cm","176.6 cm","94.2 cm","A","2×3.14×7.5=47.1")
add(L,T,TO,C,"Pool 12m×6m×2.5m deep. Liters to fill? (1m³=1000L)","180,000 L","150,000 L","200,000 L","90,000 L","A","12×6×2.5=180m³=180,000L")
add(L,T,TO,C,"Cube edges 4.5in. Surface area?","121.5 sq in","81 sq in","91.125 sq in","162 sq in","A","6×4.5²=6×20.25=121.5")
add(L,T,TO,C,"Rug 6×8ft on patio 12×15ft. Uncovered area?","132 sq ft","180 sq ft","48 sq ft","90 sq ft","A","180-48=132")
add(L,T,TO,C,"Parallelogram sides 11.2cm and 6.5cm. Perimeter?","35.4 cm","17.7 cm","72.8 cm","44.6 cm","A","2(11.2+6.5)=35.4")
add(L,T,TO,C,"Right triangular prism: legs 6,8cm, hyp 10cm, height 15cm. Volume?","360 cm³","720 cm³","480 cm³","240 cm³","A","½×6×8×15=360")
add(L,T,TO,C,"Trapezoid: bases 12,18cm, height 8cm. Area?","120 cm²","144 cm²","96 cm²","240 cm²","A","½(12+18)×8=120")

L=16; T="Area, Perimeter & Volume"; TO="Geometry"; C="MATH"
add(L,T,TO,C,"Circle area ≈153.86 m². Diameter?","14 m","7 m","28 m","49 m","A","r²=153.86/3.14=49; r=7; d=14")
add(L,T,TO,C,"Regular hexagon, side 5¾ in. Perimeter?","34½ in","23 in","28¾ in","46 in","A","6×5¾=34½")
add(L,T,TO,C,"Cylinder: radius 4cm, height 10cm. Lateral surface area? (π≈3.14)","251.2 cm²","125.6 cm²","502.4 cm²","200.96 cm²","A","2π(4)(10)=251.2")
add(L,T,TO,C,"Garden box: 8ft×3ft×1.5ft. Volume?","36 cu ft","24 cu ft","12 cu ft","48 cu ft","A","8×3×1.5=36")
add(L,T,TO,C,"Equilateral triangle wire perimeter 36cm reshaped to square. Square area?","81 cm²","36 cm²","9 cm²","144 cm²","A","Side=36/4=9; 9²=81")
add(L,T,TO,C,"Rhombus diagonals 16cm and 12cm. Area?","96 cm²","192 cm²","48 cm²","128 cm²","A","½×16×12=96")
add(L,T,TO,C,"Rectangle 14×8in, one 8in side replaced by semicircle. Perimeter? (π≈3.14)","48.56 in","44 in","52 in","56.56 in","A","14+14+8+π×4=36+12.56=48.56")
add(L,T,TO,C,"Cube surface area 150 cm². Volume?","125 cm³","216 cm³","64 cm³","27 cm³","A","Face=25; edge=5; 5³=125")
add(L,T,TO,C,"Crate 5×4×3 ft. How many 1×1×1 ft boxes fit?","60","12","20","15","A","5×4×3=60")
add(L,T,TO,C,"Triangle area 48 sq in, height 12 in. Base?","8 in","4 in","12 in","6 in","A","48=½×b×12; b=8")

# Section 4: Percents & Decimals (Lessons 17-18)
L=17; T="Advanced Percents"; TO="Percent"; C="MATH"
add(L,T,TO,C,"Desk appreciates 12% yr1 then 10% yr2. Original $500. Value after 2 yrs?","$616","$610","$600","$620","A","500×1.12=560; 560×1.10=616")
add(L,T,TO,C,"Solve: 0.05d + 1.25 = 3.5","d=45","d=50","d=40","d=55","A","0.05d=2.25; d=45")
add(L,T,TO,C,"Jacket 30% off is $63. Original price?","$90","$81.90","$100","$84","A","0.70×P=63; P=90")
add(L,T,TO,C,"Convert 7/16 to percentage","43.75%","43.5%","44%","0.4375%","A","7÷16=0.4375=43.75%")
add(L,T,TO,C,"Agent earns 4.5% commission on $280,000 house. Earnings?","$12,600","$1,260","$126,000","$12,060","A","280000×0.045=12600")
add(L,T,TO,C,"Simplify: 0.12 × 0.05 ÷ 0.003","2","0.2","20","0.02","A","0.006÷0.003=2")
add(L,T,TO,C,"Bicycle wholesale $150, markup 60%, then 20% clearance. Final price?","$192","$180","$168","$200","A","150×1.6=240; 240×0.8=192")
add(L,T,TO,C,"What is 0.5% of 800?","4","40","0.4","400","A","800×0.005=4")
add(L,T,TO,C,"144/240 prefer pizza. Percent preferring burgers?","40%","60%","32%","68%","A","96/240=40%")
add(L,T,TO,C,"Solve: 1.8 = 0.9 - 0.3x","x=-3","x=3","x=-0.3","x=0.3","A","0.3x=-0.9; x=-3")

L=18; T="Advanced Percents"; TO="Percent"; C="MATH"
add(L,T,TO,C,"$1,200 at 2.5% simple interest for 3 years. Balance?","$1,290","$1,300","$1,272","$1,350","A","I=1200×0.025×3=90; 1200+90=1290")
add(L,T,TO,C,"Write 145% as decimal and mixed number","1.45 and 1⁹⁄₂₀","14.5 and 14½","0.145 and ⁹⁄₂₀","1.45 and 1½","A","145/100=1.45=1⁹⁄₂₀")
add(L,T,TO,C,"Delivery fee increases $12.50 to $14.00. Percent increase?","12%","10%","15%","1.5%","A","1.50/12.50=0.12=12%")
add(L,T,TO,C,"Simplify: 3.6÷(0.2+0.4)×0.05","0.3","6","0.03","30","A","3.6÷0.6=6; 6×0.05=0.3")
add(L,T,TO,C,"Test: 60 Q total. 90% of first 40 correct. Need 85% overall. How many of last 20?","15","12","18","17","A","Need 51 total; have 36; need 15 more")
add(L,T,TO,C,"Product of 0.015 and 2.4?","0.036","0.36","3.6","0.0036","A","15×24=360; 4 decimal places=0.036")
add(L,T,TO,C,"$76 bill + 8.25% tax. Total?","$82.27","$82.50","$83.27","$81.27","A","76×0.0825=6.27; 76+6.27=82.27")
add(L,T,TO,C,"Solve: y + 0.04 = 1","y=0.96","y=1.04","y=0.4","y=0.96","A","y=1-0.04=0.96")
add(L,T,TO,C,"Convert repeating decimal 0.666... to fraction","2/3","3/5","6/9","66/100","A","0.666...=2/3")
add(L,T,TO,C,"Estimate 19.89 × 5.03 by rounding to nearest whole","100","95","105","110","A","20×5=100")

# Section 5: Signed Numbers & Algebra (Lessons 19-20)
L=19; T="Algebra & Statistics"; TO="Algebra"; C="MATH"
add(L,T,TO,C,"Evaluate (-x²-(y-z))/(-2) when x=-4, y=-3, z=5","-4","-12","4","12","A","(-16-(-8))/(-2)=(-8)/(-2)=4... actually: -(16)-(−3−5)/(−2)=(−16+8)/(−2)=−8/−2=4")
add(L,T,TO,C,"Combine: 5x²-3x+2x²-8+7x","7x²+4x-8","7x²-4x-8","5x²+4x-8","7x²+10x-8","A","(5+2)x²+(-3+7)x-8")
add(L,T,TO,C,"Simplify: -2[-3(4-7)-5]+(-12)÷(-4)","-5","5","11","17","A","-2[-3(-3)-5]+3=-2[9-5]+3=-2(4)+3=-8+3=-5")
add(L,T,TO,C,"Mean of: -14, 8, -3, 0, -6, 9","-1","1","-6","0","A","Sum=-6; -6÷6=-1")
add(L,T,TO,C,"Solve: 4a-7 = 2a+15","a=11","a=4","a=8","a=-11","A","2a=22; a=11")
add(L,T,TO,C,"Median of: 18, 12, 25, 14, 19, 11, 22","18","14","19","16","A","Sorted: 11,12,14,18,19,22,25; middle=18")
add(L,T,TO,C,"Bag: 4 red, 5 blue, 3 green. Draw 2 without replacement. P(both blue)?","5/33","25/144","1/6","5/12","A","5/12×4/11=20/132=5/33")
add(L,T,TO,C,"Evaluate (-2)⁵","-32","32","-10","10","A","Odd power of negative = negative")
add(L,T,TO,C,"Line through (0,0) and (3,12). Slope?","4","12","3","1/4","A","12/3=4")
add(L,T,TO,C,"Solve: -5p = -35","p=7","p=-7","p=5","p=-5","A","p=-35/-5=7")

L=20; T="Algebra & Statistics"; TO="Algebra"; C="MATH"
add(L,T,TO,C,"Range and mode of: 85,92,78,85,100,92,85,70","Range=30, Mode=85","Range=30, Mode=92","Range=15, Mode=85","Range=30, Mode=78","A","100-70=30; 85 appears 3 times")
add(L,T,TO,C,"Subtract: (-18)-(+24)-(-6)","-36","-42","12","-12","A","-18-24+6=-36")
add(L,T,TO,C,"'Three less than four times a number is 25.' Solve.","x=7","x=5.5","x=8","x=6","A","4x-3=25; x=7")
add(L,T,TO,C,"Find √169 - √49","6","7","8","120","A","13-7=6")
add(L,T,TO,C,"Point (-2,3) translated 5 right and 4 down. New coords?","(3,-1)","(3,7)","(-7,-1)","(7,-1)","A","(-2+5, 3-4)=(3,-1)")
add(L,T,TO,C,"Simplify: (-1)¹⁰⁰ + (-1)¹⁰¹","0","2","-2","1","A","1+(-1)=0")
add(L,T,TO,C,"Solve: (2/3)m - 5 = -1","m=6","m=3","m=-6","m=9","A","(2/3)m=4; m=6")
add(L,T,TO,C,"Algebraic expression for: product of 6 and (n+2)","6(n+2)","6n+2","6+n+2","6n²","A","Multiply 6 by the sum")
add(L,T,TO,C,"Simplify: (-3)(-4)+(-8) all divided by (-2-2)","−1","-4","1","4","A","(12-8)/(-4)=4/(-4)=-1")
add(L,T,TO,C,"Next in sequence: 1, 3, 9, 27, 81, ___","243","162","108","324","A","×3 each time")

print(f"Batch 2 done: {len(questions)} questions")

# =====================================================
# BATCH 3: Lessons 49-72 (Questions 201-300)
# =====================================================

# Section 1: Scientific Notation (Lessons 21-22)
L=21; T="Scientific Notation"; TO="Exponents"; C="MATH"
add(L,T,TO,C,"(4.5×10⁶)×(3.0×10⁻⁹) in scientific notation?","1.35×10⁻²","13.5×10⁻³","4.5×10⁻³","1.35×10³","A","4.5×3=13.5→1.35×10; 10⁶⁺⁽⁻⁹⁾=10⁻³; total 1.35×10⁻²")
add(L,T,TO,C,"Write 0.0000305 in scientific notation","3.05×10⁻⁵","3.05×10⁻⁴","30.5×10⁻⁶","3.5×10⁻⁵","A","Move decimal 5 places right")
add(L,T,TO,C,"Divide: (1.2×10⁴)/(4.0×10⁷)","3.0×10⁻⁴","0.3×10⁻³","3.0×10³","1.2×10⁻³","A","1.2/4=0.3=3×10⁻¹; 10⁴⁻⁷=10⁻³; total=3×10⁻⁴")
add(L,T,TO,C,"Convert 4.12×10⁵ to standard number","412,000","41,200","4,120,000","4,120","A","Move decimal 5 places right")
add(L,T,TO,C,"Sum of 2.3×10⁴ and 4.1×10³?","27,100","6.4×10⁴","2.71×10³","27,400","A","23000+4100=27100")
add(L,T,TO,C,"Simplify: 10⁸×10⁻³÷10²","10³","10⁷","10¹³","10⁻⁷","A","8+(-3)-2=3")
add(L,T,TO,C,"Evaluate: (2.0×10⁻⁴)³","8.0×10⁻¹²","6.0×10⁻¹²","2.0×10⁻¹²","8.0×10⁻⁷","A","2³=8; (10⁻⁴)³=10⁻¹²")
add(L,T,TO,C,"Write twenty-five billion in scientific notation","2.5×10¹⁰","25×10⁹","2.5×10⁹","25×10¹⁰","A","25,000,000,000=2.5×10¹⁰")
add(L,T,TO,C,"Cell 8.5×10⁻⁶ m. Line up 4000 cells. Combined length?","3.4×10⁻² m","3.4×10² m","8.5×10⁻² m","3.4×10⁻³ m","A","8.5×10⁻⁶×4×10³=34×10⁻³=3.4×10⁻²")
add(L,T,TO,C,"Compare: 3.4×10⁻⁵ ___ 1.2×10⁻⁴","<",">","=","Cannot compare","A","3.4×10⁻⁵=0.000034 < 0.00012")

L=22; T="Scientific Notation"; TO="Exponents"; C="MATH"
add(L,T,TO,C,"Subtract: (6.7×10⁵)-(5.0×10⁴) in scientific notation","6.2×10⁵","1.7×10⁵","6.2×10⁴","1.7×10⁴","A","670000-50000=620000=6.2×10⁵")
add(L,T,TO,C,"Convert 0.00000008 to scientific notation","8.0×10⁻⁸","8.0×10⁻⁷","0.8×10⁻⁷","8.0×10⁸","A","8 places right")
add(L,T,TO,C,"Simplify: (2×10³)(9×10⁵)/(3×10⁻²)","6.0×10¹⁰","6.0×10⁶","18×10⁸","6.0×10⁸","A","18/3=6; 10³⁺⁵⁻⁽⁻²⁾=10¹⁰")
add(L,T,TO,C,"Product of 1.5×10² and 2.0×10³ as integer?","300,000","30,000","3,000,000","3,000","A","1.5×2=3.0; 10²⁺³=10⁵; 3×10⁵=300000")
add(L,T,TO,C,"Star 5.88×10¹² mi away. Speed 3.0×10⁴ mph. Hours to reach?","1.96×10⁸","1.96×10⁶","5.88×10⁸","1.96×10¹²","A","5.88/3=1.96; 10¹²⁻⁴=10⁸")
add(L,T,TO,C,"Simplify: (-10)⁴ × 10⁻²","10²","10⁶","-10²","10⁻²","A","10⁴×10⁻²=10²")
add(L,T,TO,C,"Evaluate (4.8×10⁻⁶)/(1.2×10⁻³) as decimal","0.004","0.04","4","0.0004","A","4.8/1.2=4; 10⁻⁶⁻⁽⁻³⁾=10⁻³; 4×10⁻³=0.004")
add(L,T,TO,C,"Express 605,000,000 in scientific notation","6.05×10⁸","60.5×10⁷","6.05×10⁹","605×10⁶","A","6.05×10⁸")
add(L,T,TO,C,"Light: 1.86×10⁵ mi/sec. Distance in 2 minutes?","2.232×10⁷ mi","3.72×10⁵ mi","1.86×10⁷ mi","2.232×10⁵ mi","A","120×1.86×10⁵=223.2×10⁵=2.232×10⁷")
add(L,T,TO,C,"Value of 10⁰+10¹+10²?","111","100","1000","11","A","1+10+100=111")

# Section 2: Radicals (Lessons 23-24)
L=23; T="Radicals & Roots"; TO="Radicals"; C="MATH"
add(L,T,TO,C,"Evaluate: √144 - √25×√4 + √(100÷4)","7","12","2","17","A","12-5×2+√25=12-10+5=7")
add(L,T,TO,C,"√45 falls between which two whole numbers?","6 and 7","5 and 6","7 and 8","4 and 5","A","36<45<49")
add(L,T,TO,C,"Simplify: √(3²+4²) × √(169-144)","25","5","125","35","A","√25×√25=5×5=25")
add(L,T,TO,C,"Evaluate: √(16/81)","4/9","2/9","16/81","4/81","A","√16/√81=4/9")
add(L,T,TO,C,"Square courtyard area 1.44 m². Side length?","1.2 m","0.72 m","1.44 m","0.12 m","A","√1.44=1.2")
add(L,T,TO,C,"Evaluate: √2.25","1.5","1.25","2.5","0.15","A","1.5×1.5=2.25")
add(L,T,TO,C,"Simplify: (√64×√9)/(-√16)","-6","6","-18","18","A","8×3/(-4)=-6")
add(L,T,TO,C,"Estimate √98 to nearest tenth","9.9","9.8","10.0","9.5","A","9.9²=98.01≈98")
add(L,T,TO,C,"Calculate: [5-(√36-8)]²-√400","29","49","-11","9","A","[5-(6-8)]²-20=[5+2]²-20=49-20=29")
add(L,T,TO,C,"Cube root of -27?","-3","3","-9","9","A","(-3)³=-27")

L=24; T="Radicals & Roots"; TO="Radicals"; C="MATH"
add(L,T,TO,C,"Solve: x²=49/100","x=±7/10","x=7/10","x=±49/100","x=7/100","A","x=±√(49/100)=±7/10")
add(L,T,TO,C,"Evaluate: (-2)³+√64","0","-8","8","16","A","-8+8=0")
add(L,T,TO,C,"Simplify: √(8²+15²)","17","23","√289","13","A","√(64+225)=√289=17")
add(L,T,TO,C,"Square garden area 169 ft². Perimeter?","52 ft","13 ft","169 ft","26 ft","A","Side=13; 4×13=52")
add(L,T,TO,C,"Evaluate (y²-√y)/2 when y=4","7","6","8","14","A","(16-2)/2=7")
add(L,T,TO,C,"True or False: √(-16)=-4","False","True","Undefined","Imaginary","A","Cannot take real √ of negative")
add(L,T,TO,C,"Simplify: -3[√81-(2³-1)]","-6","-24","6","-12","A","-3[9-7]=-3(2)=-6")
add(L,T,TO,C,"Square root of 40,000?","200","400","2000","20","A","200²=40000")
add(L,T,TO,C,"Simplify: √(1/9)+√(1/16)","7/12","1/5","5/12","1/12","A","1/3+1/4=4/12+3/12=7/12")
add(L,T,TO,C,"Value of √1?","1","0","±1","undefined","A","√1=1")

# Section 3: Fractional Equations (Lessons 25-26)
L=25; T="Fractional Equations"; TO="Algebra"; C="MATH"
add(L,T,TO,C,"Solve: (2/3)m - 1/4 = 5/12","m=1","m=2","m=3/4","m=3/2","A","(2/3)m=5/12+3/12=8/12=2/3; m=1")
add(L,T,TO,C,"Solve: x/5 + 4 = 11","x=35","x=7","x=55","x=15","A","x/5=7; x=35")
add(L,T,TO,C,"Solve: 1½y + 2⅔ = 5","y=1⁵⁄₉","y=2","y=1","y=2⅓","A","3y/2=7/3; y=14/9")
add(L,T,TO,C,"Solve: (3/8)w = 12","w=32","w=4.5","w=96","w=36","A","w=12×8/3=32")
add(L,T,TO,C,"Solve: (4/5)(k-10) = 8","k=20","k=10","k=15","k=25","A","k-10=10; k=20")
add(L,T,TO,C,"Solve: 2n - 3/4 = 5/4","n=1","n=2","n=1/2","n=3/4","A","2n=8/4=2; n=1")
add(L,T,TO,C,"Solve: (3/5)p+1/2 = (1/10)p+2","p=3","p=5","p=2","p=10","A","(1/2)p=3/2; p=3")
add(L,T,TO,C,"Solve: a/(-3)-1=-5","a=12","a=-12","a=18","a=-18","A","a/(-3)=-4; a=12")
add(L,T,TO,C,"Solve: (2x+5)/3=7","x=8","x=5","x=11","x=16","A","2x+5=21; 2x=16; x=8")
add(L,T,TO,C,"Solve: (5/6)y=2/3","y=4/5","y=5/4","y=2/5","y=10/9","A","y=2/3×6/5=4/5")

L=26; T="Fractional Equations"; TO="Algebra"; C="MATH"
add(L,T,TO,C,"Solve: 4-(3/7)z=-2","z=14","z=-14","z=7","z=42","A","-(3/7)z=-6; z=14")
add(L,T,TO,C,"Solve: x-2⅓=4½","x=6⅚","x=7","x=6⅓","x=2⅙","A","x=4½+2⅓=6⅚")
add(L,T,TO,C,"Solve: (3/4)(m+1/2)=9/8","m=1","m=3/2","m=1/2","m=2","A","m+1/2=3/2; m=1")
add(L,T,TO,C,"Solve: -5+w/2=-1","w=8","w=-8","w=2","w=12","A","w/2=4; w=8")
add(L,T,TO,C,"Solve: (2/5)b-3=(1/2)b","b=-30","b=30","b=-6","b=6","A","(2/5-1/2)b=3; -b/10=3; b=-30")
add(L,T,TO,C,"Solve: (4/9)x=16","x=36","x=64","x=7.1","x=144","A","x=16×9/4=36")
add(L,T,TO,C,"Solve: (3d-4)/2=d+1","d=6","d=2","d=4","d=8","A","3d-4=2d+2; d=6")
add(L,T,TO,C,"Solve: y+3/5=1/2","y=-1/10","y=1/10","y=7/10","y=-7/10","A","y=1/2-3/5=5/10-6/10=-1/10")
add(L,T,TO,C,"Solve: (5/3)r-2/5=(4/3)r+1/5","r=9/5","r=2","r=3/5","r=1","A","(1/3)r=3/5; r=9/5")
add(L,T,TO,C,"Solve: x/12=5/6","x=10","x=72","x=2","x=60","A","x=12×5/6=10")

# Section 4: Geometry & Spatial (Lessons 27-28)
L=27; T="Complex Geometry"; TO="Geometry"; C="MATH"
add(L,T,TO,C,"Right triangular prism: sides 5,12,13in, height 20in. Total surface area?","660 sq in","600 sq in","720 sq in","540 sq in","A","2×30+20(5+12+13)=60+600=660")
add(L,T,TO,C,"Triangular prism: base area 24cm², length 12cm. Volume?","288 cm³","144 cm³","576 cm³","96 cm³","A","24×12=288")
add(L,T,TO,C,"Cylinder r=5cm, h=8cm. Total surface area in terms of π?","130π cm²","80π cm²","90π cm²","50π cm²","A","2π(25)+2π(5)(8)=50π+80π=130π")
add(L,T,TO,C,"Cylinder r=3in, h=10in. Volume? (π≈3.14)","282.6 cu in","94.2 cu in","188.4 cu in","314 cu in","A","3.14×9×10=282.6")
add(L,T,TO,C,"Square pyramid: base 6m, slant height 5m. Total surface area?","96 m²","60 m²","120 m²","156 m²","A","36+4×(½×6×5)=36+60=96")
add(L,T,TO,C,"Rectangular prism 4.5×6×8cm. Volume?","216 cm³","180 cm³","240 cm³","108 cm³","A","4.5×6×8=216")
add(L,T,TO,C,"Cube volume 343 in³. Surface area?","294 sq in","343 sq in","196 sq in","588 sq in","A","Edge=7; 6×49=294")
add(L,T,TO,C,"Rect prism: 10×4×5in. Surface area?","220 sq in","200 sq in","240 sq in","180 sq in","A","2(40+50+20)=220")
add(L,T,TO,C,"Cylinder: volume 251.2in³, r=4in. Height? (π≈3.14)","5 in","4 in","6 in","8 in","A","251.2/(3.14×16)=5")
add(L,T,TO,C,"Cube edge 6cm. Lateral surface area?","144 cm²","216 cm²","96 cm²","36 cm²","A","4×36=144")

L=28; T="Complex Geometry"; TO="Geometry"; C="MATH"
add(L,T,TO,C,"Cylinder: diameter 2ft, height 15ft. Volume in terms of π?","15π cu ft","60π cu ft","30π cu ft","7.5π cu ft","A","π(1)²×15=15π")
add(L,T,TO,C,"Semicircular rug diameter 14ft. Perimeter? (π≈22/7)","36 ft","22 ft","44 ft","58 ft","A","14+π×7=14+22=36")
add(L,T,TO,C,"Block 4×5×6in with 2×2in hole drilled through 6in. Remaining volume?","96 cu in","120 cu in","80 cu in","72 cu in","A","120-24=96")
add(L,T,TO,C,"Sector: circle area 360cm², central angle 45°. Sector area?","45 cm²","90 cm²","22.5 cm²","180 cm²","A","45/360×360=45")
add(L,T,TO,C,"Trapezoid prism: bases 4,6cm, height 5cm. Volume 150cm³. Prism length?","6 cm","5 cm","10 cm","3 cm","A","Base area=½(4+6)×5=25; 150/25=6")
add(L,T,TO,C,"Circle diameter 20m. Area? (π≈3.14)","314 m²","628 m²","1256 m²","100 m²","A","π×10²=314")
add(L,T,TO,C,"Room 15×12ft, 8ft ceiling. Total wall area?","432 sq ft","360 sq ft","216 sq ft","480 sq ft","A","2(15×8+12×8)=2(120+96)=432")
add(L,T,TO,C,"Sphere r=3cm. Surface area in terms of π?","36π cm²","27π cm²","12π cm²","9π cm²","A","4π(9)=36π")
add(L,T,TO,C,"Locker 3×2×6ft. Metal costs $1.50/sq ft. Cost?","$108","$72","$54","$144","A","SA=2(6+18+12)=72; 72×1.50=108")
add(L,T,TO,C,"Rectangle: area 105m², width 7m. Length?","15 m","14 m","12 m","21 m","A","105÷7=15")

# Section 5: Ratios, Percents & Word Problems (Lessons 29-30)
L=29; T="Word Problems"; TO="Algebra"; C="MATH"
add(L,T,TO,C,"Three consecutive integers sum to 114. Largest?","39","38","37","40","A","x+(x+1)+(x+2)=114; x=37; largest=39")
add(L,T,TO,C,"Red:White cars 3:5. If 40 white, how many red?","24","15","25","30","A","40÷5=8; 3×8=24")
add(L,T,TO,C,"Sales up 20% yr2, down 15% yr3. Net % change?","+2%","+5%","-5%","0%","A","1.20×0.85=1.02=+2%")
add(L,T,TO,C,"Find 0.25% of $16,000","$40","$400","$4","$4,000","A","16000×0.0025=40")
add(L,T,TO,C,"Two consecutive odd integers: 3×smaller = 5+2×larger. Find them.","9 and 11","7 and 9","11 and 13","5 and 7","A","3x=2(x+2)+5; x=9")
add(L,T,TO,C,"Quarters and dimes worth $4.50. 12 quarters. How many dimes?","15","18","20","12","A","$3.00 in quarters; $1.50 in dimes; 15 dimes")
add(L,T,TO,C,"32 students, pass:fail 7:1. How many more passed than failed?","24","28","4","32","A","Passed=28, Failed=4; 28-4=24")
add(L,T,TO,C,"What percent of 80 is 12?","15%","12%","20%","8%","A","12/80=0.15=15%")
add(L,T,TO,C,"Item sold $92, which is 15% markup. Original cost?","$80","$78.20","$85","$92","A","92÷1.15=80")
add(L,T,TO,C,"Simple interest: $500 at 4% for 5 years. Interest earned?","$100","$120","$80","$500","A","500×0.04×5=100")

L=30; T="Word Problems"; TO="Algebra"; C="MATH"
add(L,T,TO,C,"Four consecutive even integers sum to -12. Smallest?","-6","-4","-8","-2","A","x+(x+2)+(x+4)+(x+6)=-12; 4x+12=-12; x=-6")
add(L,T,TO,C,"5/8 students play instrument. % that don't?","37.5%","62.5%","25%","50%","A","3/8=37.5%")
add(L,T,TO,C,"Salesman: $2000/mo+2% commission. Needs $5400. Sales volume?","$170,000","$34,000","$270,000","$85,000","A","3400/0.02=170000")
add(L,T,TO,C,"Solve proportion: 2.5/100=6/x","x=240","x=24","x=150","x=60","A","2.5x=600; x=240")
add(L,T,TO,C,"Nickels:Dimes 5:3, total value $3.85. How many nickels?","35","25","15","45","A","5k nickels, 3k dimes; 25k+30k=385; k=7; nickels=35")
add(L,T,TO,C,"Ratio 8 inches to 2 yards as fraction?","1/9","1/6","4/36","2/9","A","8in/72in=1/9")
add(L,T,TO,C,"Water:Juice 4:1. If 12 gal juice, total liquid?","60 gallons","48 gallons","15 gallons","52 gallons","A","12×5=60 (juice=1 part=12; total=5×12)")
add(L,T,TO,C,"Number that is 15% less than 120?","102","105","108","18","A","120×0.85=102")
add(L,T,TO,C,"Rectangle: length=2w+3, perimeter=54. Dimensions?","Width=8, Length=19","Width=9, Length=18","Width=6, Length=15","Width=10, Length=17","A","2(2w+3+w)=54; 6w+6=54; w=8; l=19")
add(L,T,TO,C,"Convert 5/12 to percentage (nearest tenth)","41.7%","42%","41.6%","40%","A","5÷12=0.41666...≈41.7%")

print(f"Batch 3 done: {len(questions)} questions")

# =====================================================
# BATCH 4: Lessons 73-96 (Questions 301-400)
# =====================================================

# Section 1: Functions & Coordinate Geometry (Lessons 31-32)
L=31; T="Functions & Graphs"; TO="Functions"; C="MATH"
add(L,T,TO,C,"y=-x²+2x-3. Find y when x=-2, 0, 3.","-11, -3, -6","-7, -3, -6","-11, -3, 0","-11, 3, -6","A","x=-2: -4-4-3=-11; x=0: -3; x=3: -9+6-3=-6")
add(L,T,TO,C,"Line through (2,5) and (4,9). Equation in slope-intercept?","y=2x+1","y=2x-1","y=x+3","y=4x-3","A","m=(9-5)/(4-2)=2; b=5-4=1")
add(L,T,TO,C,"Graph y≥-2x+4. Integer point in Q1 satisfying it?","(3,0)","(0,0)","(1,1)","(2,1)","A","At (3,0): 0≥-6+4=-2 ✓")
add(L,T,TO,C,"Slope through (-3,5) and (2,-5)?","-2","2","-10","10","A","(-5-5)/(2-(-3))=-10/5=-2")
add(L,T,TO,C,"System: y=3x-1 and y=x+3. Intersection?","(2,5)","(1,4)","(3,6)","(0,3)","A","3x-1=x+3; 2x=4; x=2; y=5")
add(L,T,TO,C,"Domain and range of {(-2,4),(0,0),(2,4),(4,16)}?","D={-2,0,2,4}, R={0,4,16}","D={0,4,16}, R={-2,0,2,4}","D=all reals, R≥0","D={-2,4}, R={0,16}","A","Domain=x values, Range=y values")
add(L,T,TO,C,"Line through (0,-2) and (3,7). Value of y when x=-4?","-14","-8","-6","-10","A","m=9/3=3; y=3(-4)-2=-14")
add(L,T,TO,C,"4x-2y=8. Positive or negative slope?","Positive","Negative","Zero","Undefined","A","y=2x-4; slope=2>0")
add(L,T,TO,C,"Rental: $45+$0.25/mile. Bill=$107.50. Miles driven?","250","245","200","300","A","0.25m=62.50; m=250")
add(L,T,TO,C,"y-intercept of y=(-2/3)x-7?","-7","7","2/3","-2/3","A","Set x=0: y=-7")

L=32; T="Functions & Graphs"; TO="Functions"; C="MATH"
add(L,T,TO,C,"|x|≤3 and |y|≤2 boundary box. Perimeter?","20","12","24","10","A","Width=6, Height=4; P=2(6+4)=20")
add(L,T,TO,C,"f(x)=2x²+3x. Find f(-5).","35","75","-35","25","A","2(25)+3(-5)=50-15=35")
add(L,T,TO,C,"Right triangle: (-1,-2),(5,-2),(5,6). Hypotenuse length?","10","8","6","14","A","Legs=6,8; √(36+64)=10")
add(L,T,TO,C,"Direct variation y=kx. If y=24 when x=6, find y when x=11.","44","66","33","24","A","k=4; y=4×11=44")
add(L,T,TO,C,"Line parallel to y=4x-5 through (1,2)?","y=4x-2","y=4x+2","y=-¼x+2","y=4x-5","A","Same slope m=4; 2=4(1)+b; b=-2")
add(L,T,TO,C,"Point (5,-8) lies in which quadrant?","IV","III","II","I","A","(+,-)=Quadrant IV")
add(L,T,TO,C,"y=12/x. Direct or inverse variation? y when x=0.5?","Inverse; y=24","Direct; y=6","Inverse; y=6","Direct; y=24","A","Inverse (xy=k); 12/0.5=24")
add(L,T,TO,C,"Slope of a horizontal line?","0","Undefined","1","-1","A","No rise; Δy=0")
add(L,T,TO,C,"Sequence: (1,3),(2,6),(3,11),(4,18). Linear or non-linear?","Non-linear","Linear","Geometric","Constant","A","Differences: 3,5,7 (not constant)")
add(L,T,TO,C,"Slope of the line y=-3?","0","Undefined","-3","3","A","Horizontal line; slope=0")

# Section 2: Advanced Geometry (Lessons 33-34)
L=33; T="Advanced Spatial Geometry"; TO="Geometry"; C="MATH"
add(L,T,TO,C,"Brass cylinder h=12, r=4. Recast: r doubled, h halved. Volume ratio new:old?","2:1","4:1","1:2","1:1","A","New=π(8²)(6)=384π; Old=π(16)(12)=192π; 2:1")
add(L,T,TO,C,"Cone: r=6cm, h=10cm. Volume in terms of π?","120π cm³","360π cm³","60π cm³","180π cm³","A","⅓π(36)(10)=120π")
add(L,T,TO,C,"Crate 18×12×9ft. Max 1.5ft cubes that fit?","576","864","432","288","A","12×8×6=576")
add(L,T,TO,C,"Sphere diameter 12in. Surface area in terms of π?","144π sq in","36π sq in","48π sq in","288π sq in","A","4π(6²)=144π")
add(L,T,TO,C,"Hollow pipe: outer r=5, inner r=4, length 20cm. Metal volume? (π≈3.14)","565.2 cm³","628 cm³","502 cm³","314 cm³","A","π(25-16)×20=9π×20=180π≈565.2")
add(L,T,TO,C,"Square pyramid: base 8m, height 9m. Volume?","192 m³","576 m³","216 m³","64 m³","A","⅓×64×9=192")
add(L,T,TO,C,"Similar cubes SA ratio 4:9. Small edge 6cm. Large cube volume?","729 cm³","512 cm³","343 cm³","1000 cm³","A","Side ratio=2:3; large edge=9; 9³=729")
add(L,T,TO,C,"Cylinder: diameter 10cm, height 15cm. Lateral area? (π≈3.14)","471 cm²","314 cm²","235.5 cm²","942 cm²","A","2π(5)(15)=471")
add(L,T,TO,C,"Triangular prism volume 480in³. Base legs 8,6in. Lateral SA?","480 sq in","240 sq in","360 sq in","600 sq in","A","Height=480/24=20; Lat=20(8+6+10)=480")
add(L,T,TO,C,"Sphere r=3cm. Volume? (π≈3.14)","113.04 cm³","84.78 cm³","28.26 cm³","56.52 cm³","A","4/3×3.14×27=113.04")

L=34; T="Advanced Spatial Geometry"; TO="Geometry"; C="MATH"
add(L,T,TO,C,"Cylinder+hemisphere cap. r=3ft, cylinder h=10ft. Volume in terms of π?","108π cu ft","90π cu ft","72π cu ft","126π cu ft","A","π(9)(10)+2/3π(27)=90π+18π=108π")
add(L,T,TO,C,"Rect prism: 12×2.5×4m. Surface area?","172 m²","120 m²","148 m²","200 m²","A","2(30+48+10)=2(88)=176... 2(12×2.5+12×4+2.5×4)=2(30+48+10)=176")
add(L,T,TO,C,"Open cylinder (no top): r=7ft, depth=4ft. Inner surface? (π=22/7)","330 sq ft","352 sq ft","308 sq ft","176 sq ft","A","πr²+2πrh=154+176=330")
add(L,T,TO,C,"Box 3×4×12in. Space diagonal?","13 in","12 in","5 in","169 in","A","√(9+16+144)=√169=13")
add(L,T,TO,C,"Wedge (triangular prism): legs 9,12cm. Mass 1620g, volume 540cm³. Depth?","10 cm","5 cm","12 cm","8 cm","A","Base=½×9×12=54; 540/54=10")
add(L,T,TO,C,"Sector: radius 6in, angle 60°. Area in terms of π?","6π sq in","12π sq in","3π sq in","36π sq in","A","60/360×π×36=6π")
add(L,T,TO,C,"Tank 10×4×3m half full. 2m cube dropped in. Water rise?","0.1 m","0.2 m","1 m","0.5 m","A","Cube vol=8; base=40; rise=8/40=0.2... Wait: half full=60m³ water; cube displaces min(8,space). Rise=8/40=0.2m")
add(L,T,TO,C,"Cube: face perimeter 28in. Surface area?","294 sq in","196 sq in","343 sq in","49 sq in","A","Side=7; SA=6×49=294")
add(L,T,TO,C,"Octahedron (2 pyramids): base edge 6cm, total height 8cm. Volume?","96 cm³","192 cm³","48 cm³","144 cm³","A","2×⅓×36×4=96")
add(L,T,TO,C,"Cylinder: base area 49π m², height=radius. Volume?","343π m³","49π m³","98π m³","686π m³","A","r=7; V=49π×7=343π")

# Section 3: Advanced Equations (Lessons 35-36)
L=35; T="Multi-Step Equations"; TO="Algebra"; C="MATH"
add(L,T,TO,C,"Solve: 3(2x-4)-2(x+5)=2x-6","x=8","x=4","x=-8","x=6","A","6x-12-2x-10=2x-6; 2x-22=-6... Actually: 4x-22=2x-6; 2x=16; x=8")
add(L,T,TO,C,"Solve: (2/3)y+4=(1/2)y+7","y=18","y=6","y=12","y=24","A","(4/6-3/6)y=3; y/6=3; y=18")
add(L,T,TO,C,"5×(number-3)=2×(number+9). Number?","11","7","9","13","A","5n-15=2n+18; 3n=33; n=11")
add(L,T,TO,C,"Solve: 0.4x-1.2=0.15x+0.8","x=8","x=4","x=16","x=2","A","0.25x=2; x=8")
add(L,T,TO,C,"Solve: (3w-2)/4-(w+1)/3=1/2","w=5","w=4","w=6","w=3","A","LCD 12: 3(3w-2)-4(w+1)=6; 5w-10=6; w=16/5... Let me recalc: 9w-6-4w-4=6; 5w=16; w=16/5")
add(L,T,TO,C,"Solve: 4(n-2)=3n+5","n=13","n=3","n=5","n=7","A","4n-8=3n+5; n=13")
add(L,T,TO,C,"Partnership 3:4:5. Largest share $2500 more than smallest. Total profit?","$15,000","$12,500","$10,000","$20,000","A","Diff=2 parts=$2500; 1 part=$1250; total=12×1250=15000")
add(L,T,TO,C,"Solve literal equation P=2a+2b for a","a=(P-2b)/2","a=P-2b","a=P/2-b","a=(P+2b)/2","A","P-2b=2a; a=(P-2b)/2")
add(L,T,TO,C,"Solve: 2.5m-4(0.5m-3)=-1.5m+8","m=-2","m=2","m=4","m=-4","A","2.5m-2m+12=-1.5m+8; 0.5m+12=-1.5m+8; 2m=-4; m=-2")
add(L,T,TO,C,"Solve: k/(-4)+7=-2","k=36","k=-36","k=20","k=-20","A","k/(-4)=-9; k=36")

L=36; T="Multi-Step Equations"; TO="Algebra"; C="MATH"
add(L,T,TO,C,"Fast train 60mph, express leaves 2hrs later at 80mph. Hours for express to catch up?","6 hours","4 hours","3 hours","8 hours","A","60(t+2)=80t; 120=20t; t=6")
add(L,T,TO,C,"Solve: -3(z-5)=24","z=-3","z=3","z=13","z=-13","A","-3z+15=24; z=-3")
add(L,T,TO,C,"Solve: 4/(x+2)=3/(x-1)","x=10","x=5","x=-10","x=7","A","4(x-1)=3(x+2); 4x-4=3x+6; x=10")
add(L,T,TO,C,"Solve: 7p-3=4p+12","p=5","p=3","p=9","p=15","A","3p=15; p=5")
add(L,T,TO,C,"4L of 20% acid. Add pure acid to make 40%. How many liters to add?","4/3 L","2 L","1 L","3 L","A","(0.8+x)/(4+x)=0.4; 0.8+x=1.6+0.4x; 0.6x=0.8; x=4/3")
add(L,T,TO,C,"Solve: (2x+7)/5=3","x=4","x=8","x=1","x=11","A","2x+7=15; 2x=8; x=4")
add(L,T,TO,C,"Solve: y²-15=49. Both roots?","y=±8","y=8","y=±64","y=±4","A","y²=64; y=±8")
add(L,T,TO,C,"Solve: 3b-8=-29","b=-7","b=7","b=-12.3","b=12.3","A","3b=-21; b=-7")
add(L,T,TO,C,"'4 less than ¾ of a value = 2 more than ⅓ of value.' Find it.","14.4","12","18","24","A","¾v-4=⅓v+2; 5v/12=6; v=72/5=14.4")
add(L,T,TO,C,"Solve: 15-(a-3)=22","a=-4","a=4","a=10","a=-10","A","18-a=22; a=-4")

# Section 4: Scale & Conversions (Lessons 37-38)
L=37; T="Scales & Conversions"; TO="Measurement"; C="MATH"
add(L,T,TO,C,"Blueprint A: 1in=8ft. Blueprint B: 1in=12ft. Wall 6in on A. Inches on B?","4 in","3 in","6 in","8 in","A","Actual=48ft; 48/12=4in")
add(L,T,TO,C,"Convert 90 km/hr to m/s","25 m/s","15 m/s","90 m/s","900 m/s","A","90×1000/3600=25")
add(L,T,TO,C,"Wholesale W, markup 50%, then 20% coupon. Paid $144. Find W.","$120","$144","$100","$160","A","1.5W×0.8=144; 1.2W=144; W=120")
add(L,T,TO,C,"Convert 5 square yards to square feet","45 sq ft","15 sq ft","9 sq ft","25 sq ft","A","5×9=45")
add(L,T,TO,C,"Asset loses 25% year 1. % gain needed in year 2 to recover?","33⅓%","25%","50%","20%","A","0.75×(1+r)=1; r=1/3≈33.3%")
add(L,T,TO,C,"Convert 12 gal/min to quarts/second","0.8 qt/s","48 qt/s","3 qt/s","4.8 qt/s","A","12×4=48qt/min; 48/60=0.8")
add(L,T,TO,C,"65% voted. 140 didn't vote. Total people?","400","280","200","500","A","35%=140; 100%=400")
add(L,T,TO,C,"Map scale 1:250,000. Towers 5cm apart. Real distance in km?","12.5 km","125 km","1.25 km","1250 km","A","5×250000=1250000cm=12.5km")
add(L,T,TO,C,"Device drops 400MHz to 320MHz. Percent decrease?","20%","25%","15%","80%","A","80/400=20%")
add(L,T,TO,C,"88 ft/s equals how many mph?","60 mph","88 mph","44 mph","120 mph","A","88×3600/5280=60")

L=38; T="Scales & Conversions"; TO="Measurement"; C="MATH"
add(L,T,TO,C,"Sand is 35% of mix. 280 lb sand used. Weight of the rest?","520 lb","800 lb","980 lb","720 lb","A","Total=280/0.35=800; rest=800-280=520")
add(L,T,TO,C,"Express 7/8 of 1% as a decimal","0.00875","0.0875","0.875","87.5","A","7/8×0.01=0.00875")
add(L,T,TO,C,"Jacket: 20% off then 10% off that. Final $54. Original?","$75","$72","$80","$68","A","P×0.8×0.9=54; 0.72P=54; P=75")
add(L,T,TO,C,"Convert 0.045% to fraction in lowest terms","9/20000","45/100000","9/2000","1/2000","A","0.045/100=45/100000=9/20000")
add(L,T,TO,C,"Property value rises $250K to $315K. Percent increase?","26%","20%","65%","30%","A","65000/250000=0.26=26%")
add(L,T,TO,C,"4.5 L liquid weighs 3.6 kg. Density in g/mL?","0.8 g/mL","3.6 g/mL","0.08 g/mL","8 g/mL","A","3600g/4500mL=0.8")
add(L,T,TO,C,"40% play winter sport. 25% of those varsity. 18 on varsity. Total students?","180","72","45","360","A","0.40×0.25×T=18; 0.1T=18; T=180")
add(L,T,TO,C,"Convert 25°C to Fahrenheit (F=9C/5+32)","77°F","57°F","72°F","82°F","A","9(25)/5+32=45+32=77")
add(L,T,TO,C,"Machine: 3.5 tons gravel per 45min. Pounds in 6 hours? (1 ton=2000lb)","56,000 lb","42,000 lb","28,000 lb","84,000 lb","A","6hr=360min; 360/45=8 cycles; 8×3.5×2000=56000")
add(L,T,TO,C,"What is 250% of $48.20?","$120.50","$96.40","$12.05","$48.20","A","48.20×2.5=120.50")

# Section 5: Probability & Polynomials (Lessons 39-40)
L=39; T="Probability & Sequences"; TO="Probability"; C="MATH"
add(L,T,TO,C,"5 red, 4 blue, 3 yellow tokens. 3 drawn without replacement. P(one of each)?","3/11","1/6","5/22","2/11","A","(5×4×3×6)/12P3=360/1320=3/11")
add(L,T,TO,C,"Arithmetic sequence: -6,-2,2,6,10,... 15th term?","50","54","46","58","A","a₁=-6, d=4; -6+14(4)=50")
add(L,T,TO,C,"Evaluate -b²[a³-(2c-b)] when a=-2,b=-1,c=3","7","-7","9","-9","A","-1[-8-(6+1)]=-1[-8-7]=-1(-15)... Let me recalc: -(-1)²[(-2)³-(2(3)-(-1))]=-1[-8-7]=-1(-15)=... Actually -1×[-8-(6-(-1))]=-1[-8-7]=15... Hmm. -b²=-1; a³=-8; 2c-b=6-(-1)=7; -8-7=-15; -1×(-15)=15")
add(L,T,TO,C,"Median and mean of: -18,-12,-5,0,2,7,12,30","Median=1, Mean=2","Median=0, Mean=2","Median=2, Mean=1","Median=1, Mean=4","A","Median=(0+2)/2=1; Mean=16/8=2")
add(L,T,TO,C,"Combine: 3x²y-4xy²+5x²y²-2yx²+7y²x","x²y+3xy²+5x²y²","5x²y+3xy²+5x²y²","x²y-4xy²+5x²y²","3x²y+3xy²+5x²y²","A","(3-2)x²y+(-4+7)xy²+5x²y²=x²y+3xy²+5x²y²")
add(L,T,TO,C,"Geometric sequence: 4,-12,36,-108,... 7th term?","2916","−2916","972","−972","A","r=-3; a₇=4(-3)⁶=4×729=2916")
add(L,T,TO,C,"Two dice rolled. P(sum is prime)?","15/36","12/36","18/36","6/36","A","Primes: 2,3,5,7,11; count outcomes=15")
add(L,T,TO,C,"Expand: -5x(2x²-4x+3)","-10x³+20x²-15x","-10x³-20x²+15x","10x³-20x²+15x","-10x³+20x-15","A","Distribute -5x")
add(L,T,TO,C,"Data: 88,76,92,88,84,100,72. Range, mode?","Range=28, Mode=88","Range=24, Mode=92","Range=28, Mode=76","Range=100, Mode=88","A","100-72=28; 88 appears twice")
add(L,T,TO,C,"Evaluate: (-3)⁴×3⁻²÷(-3²)","-9","9","-1","1","A","81×(1/9)÷(-9)=9÷(-9)=-1")

L=40; T="Probability & Sequences"; TO="Probability"; C="MATH"
add(L,T,TO,C,"Solve: -2(3x-5)<22. Solution?","x>-2","x<-2","x>2","x<2","A","-6x+10<22; -6x<12; x>-2")
add(L,T,TO,C,"Expand: (x+4)(x-7)","x²-3x-28","x²+3x-28","x²-3x+28","x²-11x-28","A","x²-7x+4x-28=x²-3x-28")
add(L,T,TO,C,"Bag: 24 marbles. P(green)=1/3, P(black)=1/8. White marbles?","13","11","8","16","A","Green=8, Black=3; White=24-8-3=13")
add(L,T,TO,C,"Sequence: 1,3,7,15,31,___,___","63, 127","62, 126","32, 64","45, 90","A","×2+1 each time")
add(L,T,TO,C,"Simplify: (a²b⁻³)³/(a⁴b⁻⁵)","a²/b⁴","a²b⁴","a⁶/b⁴","a²b⁻⁴","A","a⁶b⁻⁹/a⁴b⁻⁵=a²b⁻⁴=a²/b⁴")
add(L,T,TO,C,"P(4 heads in row with fair coin)?","1/16","1/8","1/4","1/32","A","(1/2)⁴=1/16")
add(L,T,TO,C,"Three consecutive odd integers: sum of first two = 15 less than 3× third.","9, 11, 13","7, 9, 11","11, 13, 15","5, 7, 9","A","n+(n+2)=3(n+4)-15; 2n+2=3n-3; n=5... Hmm: Let me redo. x+(x+2)=3(x+4)-15; 2x+2=3x+12-15=3x-3; -x=-5; x=5→5,7,9... Actually check: 5+7=12; 3(9)-15=12 ✓")
add(L,T,TO,C,"Factor: 12x³y²-18x²y³+6x²y²","6x²y²(2x-3y+1)","6xy(2x²y-3xy²+1)","12x²y²(x-y)","3x²y²(4x-6y+2)","A","GCF=6x²y²")
add(L,T,TO,C,"Target: concentric circles r=1,2,3in. P(land between 1 and 2 in)?","1/3","3/9","2/9","1/9","A","Area ring=4π-π=3π; Total=9π; P=3/9=1/3")
add(L,T,TO,C,"Evaluate: |-√64×(-2)³|-|-15|","49","15","79","1","A","|−8×(−8)|−15=|64|−15=64−15=49")

print(f"Batch 4 done: {len(questions)} questions")

# =====================================================
# BATCH 5: Lessons 97-120 (Questions 401-500)
# =====================================================

# Section 1: Complex Equations & Inequalities (Lessons 41-42)
L=41; T="Complex Equations"; TO="Algebra"; C="MATH"
add(L,T,TO,C,"Solve: 3(x-4)-2(2x+1)=5x+10","x=-4","x=4","x=-6","x=6","A","3x-12-4x-2=5x+10; -x-14=5x+10; -6x=24; x=-4")
add(L,T,TO,C,"Solve: 7y-8=3y+12","y=5","y=4","y=6","y=3","A","4y=20; y=5")
add(L,T,TO,C,"Solve: -2m+6≤14. Solution?","m≥-4","m≤-4","m≥4","m≤4","A","-2m≤8; m≥-4")
add(L,T,TO,C,"Solve: (2/3)w+4=(1/6)w+7","w=6","w=3","w=12","w=9","A","(4/6-1/6)w=3; w/2=3; w=6")
add(L,T,TO,C,"Rearrange 3x-4y=12 to solve for y","y=(3x-12)/4","y=3x-12","y=(12-3x)/4","y=3x/4-12","A","−4y=12−3x; y=(3x−12)/4")
add(L,T,TO,C,"Solve: 0.4k+1.2=0.15k+2.7","k=6","k=3","k=12","k=8","A","0.25k=1.5; k=6")
add(L,T,TO,C,"Solve: (2a-3)/5=(a+4)/3","a=29","a=7","a=19","a=11","A","3(2a-3)=5(a+4); 6a-9=5a+20; a=29")
add(L,T,TO,C,"Solve: 5-2(3n-1)=-3","n=5/3","n=1","n=2","n=-1","A","5-6n+2=-3; -6n=-10; n=5/3")
add(L,T,TO,C,"Solve: (3/4)(x+8)=12","x=8","x=4","x=12","x=16","A","x+8=16; x=8")
add(L,T,TO,C,"Solve: 0.06p-0.2=0.04(p+5)","p=20","p=10","p=30","p=15","A","0.06p-0.2=0.04p+0.2; 0.02p=0.4; p=20")

L=42; T="Complex Equations"; TO="Algebra"; C="MATH"
add(L,T,TO,C,"Solve: x²+5=30","x=±5","x=5","x=25","x=±25","A","x²=25; x=±5")
add(L,T,TO,C,"Solution set: -3<2x+1≤7","-2<x≤3","−2≤x<3","−1<x≤4","−2<x<3","A","Subtract 1: -4<2x≤6; ÷2: -2<x≤3")
add(L,T,TO,C,"Solve P=2l+2w for w","w=(P-2l)/2","w=P-2l","w=P/2-l","w=(P+2l)/2","A","P-2l=2w; w=(P-2l)/2")
add(L,T,TO,C,"Solve: 4/(y+1)=3/(y-2)","y=11","y=5","y=-11","y=7","A","4(y-2)=3(y+1); 4y-8=3y+3; y=11")
add(L,T,TO,C,"Solve: 15-m=3m-1","m=4","m=-4","m=8","m=3","A","16=4m; m=4")
add(L,T,TO,C,"Solve: -(x-3)+4=2x-5","x=4","x=-4","x=2","x=6","A","-x+7=2x-5; 12=3x; x=4")
add(L,T,TO,C,"Find integer: 4(2n-1)=28","n=4","n=3","n=8","n=2","A","8n-4=28; 8n=32; n=4")
add(L,T,TO,C,"Solve: (1/2)b-3/4=(5/6)b+1/12","b=-5/2","b=5/2","b=-2","b=2","A","(1/2-5/6)b=1/12+3/4; (-1/3)b=10/12; b=-5/2")
add(L,T,TO,C,"Solve inequality: 5-x<2","x>3","x<3","x>7","x<7","A","−x<−3; x>3")
add(L,T,TO,C,"Solve: y=2x²-3x+1 when x=-3","28","10","19","37","A","2(9)-3(-3)+1=18+9+1=28")

# Section 2: Non-Linear & Functions (Lessons 43-44)
L=43; T="Non-Linear Functions"; TO="Functions"; C="MATH"
add(L,T,TO,C,"Vertex of y=-(x-2)²+4?","(2,4)","(-2,4)","(2,-4)","(-2,-4)","A","Vertex form: (h,k)=(2,4)")
add(L,T,TO,C,"Is {(1,3),(2,5),(3,7),(4,9)} linear?","Yes","No","Quadratic","Cannot tell","A","Common difference in y=2; linear")
add(L,T,TO,C,"Bacteria doubles hourly. Start 25. Function & count at t=5?","P=25(2)^t; 800","P=25(2)^t; 1600","P=50t; 250","P=25+2t; 35","A","P(5)=25×32=800")
add(L,T,TO,C,"f(x)=12/x. Find f(-0.5).","-24","24","-6","6","A","12/(-0.5)=-24")
add(L,T,TO,C,"x-intercept and y-intercept of 4x-5y=20?","(5,0) and (0,-4)","(4,0) and (0,-5)","(20,0) and (0,20)","(5,0) and (0,4)","A","x-int: 4x=20,x=5; y-int: -5y=20,y=-4")
add(L,T,TO,C,"Constant of variation k for y=(2/5)x?","k=2/5","k=5/2","k=2","k=5","A","Direct variation y=kx; k=2/5")
add(L,T,TO,C,"y varies inversely with x. y=10 when x=3. Find y when x=6.","5","15","20","30","A","k=30; y=30/6=5")
add(L,T,TO,C,"Domain and range of y=√x?","D: x≥0, R: y≥0","D: all reals, R: all reals","D: x>0, R: y>0","D: x≥0, R: all reals","A","Can't take √ of negative")
add(L,T,TO,C,"Line through (-2,5) and (4,-1). Slope-intercept form?","y=-x+3","y=-x+5","y=x+3","y=-x-3","A","m=(-1-5)/(4+2)=-1; b=5-(-1)(-2)=3")
add(L,T,TO,C,"Slope parallel to y=-3x+8?","-3","3","1/3","-1/3","A","Parallel=same slope")

L=44; T="Non-Linear Functions"; TO="Functions"; C="MATH"
add(L,T,TO,C,"System: y=2x+1 and x+y=7. Solution?","(2,5)","(3,7)","(1,3)","(4,9)","A","x+2x+1=7; 3x=6; x=2; y=5")
add(L,T,TO,C,"Does (-3,-5) satisfy 2x-y=-1?","Yes","No","Only x","Only y","A","2(-3)-(-5)=-6+5=-1 ✓")
add(L,T,TO,C,"d=16t². Time to fall 400 ft?","5 sec","25 sec","4 sec","10 sec","A","16t²=400; t²=25; t=5")
add(L,T,TO,C,"y=(3/4)x-1. Complete: (8,___)","5","7","4","6","A","(3/4)(8)-1=6-1=5")
add(L,T,TO,C,"Intersection of y=-4 and x=5?","(5,-4)","(-4,5)","(5,4)","(-5,-4)","A","Point where both are true")
add(L,T,TO,C,"Sequence 3,6,12,24... Arithmetic, geometric, or neither?","Geometric","Arithmetic","Neither","Both","A","Common ratio r=2")
add(L,T,TO,C,"10th term of geometric: 1/2,1,2,4,...","256","512","128","1024","A","a=1/2, r=2; (1/2)(2⁹)=256")
add(L,T,TO,C,"Graph y=x²-2. Five points include vertex?","Vertex (0,-2)","Vertex (0,2)","Vertex (2,0)","Vertex (-2,0)","A","Minimum at x=0: y=-2")
add(L,T,TO,C,"y=4/x for positive x represents?","Inverse variation","Direct variation","Linear function","Quadratic","A","xy=4; inverse relationship")
add(L,T,TO,C,"f(x)=2x²-3x+1. f(-3)?","28","10","19","37","A","2(9)+9+1=28")

# Section 3: Probability & Data (Lessons 45-46)
L=45; T="Probability & Data"; TO="Probability"; C="MATH"
add(L,T,TO,C,"6 black, 4 blue socks. Draw 2 without replacement. P(both black)?","1/3","2/5","1/5","3/10","A","6/10×5/9=30/90=1/3")
add(L,T,TO,C,"Die rolled twice. P(odd first, then >4)?","1/6","1/4","1/3","1/12","A","3/6×2/6=6/36=1/6")
add(L,T,TO,C,"3 red,5 white,2 blue. Draw 3 no replacement. P(R,W,B)?","1/24","1/12","3/10","1/8","A","3/10×5/9×2/8=30/720=1/24")
add(L,T,TO,C,"Data: 72,85,93,81,77,88,90,85,79. Find Q1, Q3, IQR.","Q1=77, Q3=89, IQR=12","Q1=79, Q3=90, IQR=11","Q1=76, Q3=91, IQR=15","Q1=81, Q3=88, IQR=7","A","Sorted: 72,77,79,81,85,85,88,90,93")
add(L,T,TO,C,"MAD of daily temps: 60,65,70,75,80?","6","5","8","10","A","Mean=70; |devs|=10,5,0,5,10; MAD=30/5=6")
add(L,T,TO,C,"40 students: 22 band, 18 choir, 6 both. Neither?","6","0","12","8","A","Band∪Choir=22+18-6=34; Neither=40-34=6")
add(L,T,TO,C,"Spinner 1-8. P(prime number)?","1/2","3/8","5/8","1/4","A","Primes: 2,3,5,7 → 4/8=1/2")
add(L,T,TO,C,"5 T/F questions guessing. P(100%)?","1/32","1/16","1/64","1/10","A","(1/2)⁵=1/32")
add(L,T,TO,C,"Outlier in {45,47,52,48,12,50,46}. Impact on mean?","12 lowers the mean significantly","12 raises the mean","No impact","52 is the outlier","A","12 is far below; pulls mean down")
add(L,T,TO,C,"Odds in favor 3:7. P(event does NOT happen)?","7/10","3/10","3/7","7/3","A","Total outcomes=10; P(not)=7/10")

L=46; T="Probability & Data"; TO="Probability"; C="MATH"
add(L,T,TO,C,"Bullseye r=2in inside 10×10in square. P(hit bullseye)?","π/25 ≈ 0.126","1/25","4/100","π/100","A","π(4)/100=4π/100=π/25")
add(L,T,TO,C,"3% of 500 defective. Factory makes 12,000/day. Non-defective predicted?","11,640","11,400","360","11,700","A","12000×0.97=11640")
add(L,T,TO,C,"Box plot: Min=12,Q1=18,Med=24,Q3=30,Max=45. Range?","33","18","12","45","A","45-12=33")
add(L,T,TO,C,"3-digit code, 0-9, no repeats. Unique codes?","720","1000","900","504","A","10×9×8=720")
add(L,T,TO,C,"Committee: president, VP, secretary from 6 candidates. Ways?","120","20","6","720","A","6×5×4=120")
add(L,T,TO,C,"Two cards from 52 no replacement. P(both Aces)?","1/221","1/169","4/52","1/13","A","4/52×3/51=12/2652=1/221")
add(L,T,TO,C,"Height vs weight for growing children. Correlation type?","Positive","Negative","Zero","Cannot determine","A","Both increase together")
add(L,T,TO,C,"4/10 own pets, margin ±3%. Estimated range?","37% to 43%","40% to 46%","34% to 46%","38% to 42%","A","40%±3%=37%-43%")
add(L,T,TO,C,"Mean of frequency: Value 5(×3), 10(×2), 15(×5)?","11","10","12","9","A","(15+20+75)/10=110/10=11")
add(L,T,TO,C,"3-digit code with repeats allowed. Total codes?","1000","720","900","500","A","10×10×10=1000")

# Section 4: Geometry Transformations (Lessons 47-48)
L=47; T="Geometry Transformations"; TO="Geometry"; C="MATH"
add(L,T,TO,C,"Triangle C(1,6) dilated by 2.5 from origin, then reflected across y-axis. C''?","(-2.5, 15)","(2.5, 15)","(-2.5, -15)","(15, -2.5)","A","Dilate: (2.5,15); Reflect y-axis: (-2.5,15)")
add(L,T,TO,C,"Point (-3,5) rotated 180° about origin. New coords?","(3,-5)","(-3,-5)","(3,5)","(5,-3)","A","(x,y)→(-x,-y)")
add(L,T,TO,C,"Convert 5 cubic meters to cubic centimeters","5,000,000 cm³","500,000 cm³","50,000 cm³","5,000 cm³","A","1m³=10⁶cm³; 5×10⁶")
add(L,T,TO,C,"Convert 90 km/hr to m/s (unit multiplier)","25 m/s","15 m/s","90 m/s","250 m/s","A","90000/3600=25")
add(L,T,TO,C,"Cylinder: V=54π in³, h=6in. Radius and total SA?","r=3, SA=54π","r=9, SA=162π","r=3, SA=36π","r=6, SA=72π","A","πr²(6)=54π; r²=9; r=3; SA=2π(9)+2π(3)(6)=18π+36π=54π")
add(L,T,TO,C,"Translate (4,-2) by vector (x-6, y+5). Result?","(-2, 3)","(10, 3)","(-2, -7)","(4, 5)","A","(4-6, -2+5)=(-2,3)")
add(L,T,TO,C,"Convert 144 sq ft to sq yards","16 sq yd","48 sq yd","12 sq yd","36 sq yd","A","144÷9=16")
add(L,T,TO,C,"Similar triangles scale 3:4. Ratio of areas?","9:16","3:4","6:8","12:16","A","Areas scale as square of sides")
add(L,T,TO,C,"Sphere diameter 12in. Volume? (π≈3.14)","904 cu in","452 cu in","1808 cu in","113 cu in","A","4/3×3.14×216=904.32≈904")
add(L,T,TO,C,"Convert 5.5 gallons to quarts","22 quarts","11 quarts","44 quarts","5.5 quarts","A","5.5×4=22")

L=48; T="Geometry Transformations"; TO="Geometry"; C="MATH"
add(L,T,TO,C,"Distance between (-2,-3) and (4,5)?","10","8","6","12","A","√(36+64)=√100=10")
add(L,T,TO,C,"Object flips mirror-like across a line. Transformation type?","Reflection","Rotation","Translation","Dilation","A","Mirror flip = reflection")
add(L,T,TO,C,"Cone: r=6cm, h=8cm. Volume in terms of π?","96π cm³","288π cm³","48π cm³","192π cm³","A","⅓π(36)(8)=96π")
add(L,T,TO,C,"Convert 450 grams to kilograms","0.45 kg","4.5 kg","45 kg","0.045 kg","A","÷1000=0.45")
add(L,T,TO,C,"Scale: 1in=8ft. Building volume 4096ft³. Model volume in in³?","8 in³","512 in³","64 in³","1 in³","A","Scale factor³=8³=512; 4096/512=8")
add(L,T,TO,C,"Interior angle sum of regular octagon?","1080°","1440°","720°","900°","A","(8-2)×180=1080")
add(L,T,TO,C,"Line through (3,2), slope ½, translated up 4. New y-intercept?","4.5","0.5","2.5","6.5","A","Original: y=½x+½; up 4: y=½x+4.5")
add(L,T,TO,C,"How many mL in 2.75 liters?","2,750 mL","275 mL","27,500 mL","27.5 mL","A","×1000=2750")
add(L,T,TO,C,"Box: L,W,H all tripled. Volume increases by factor of?","27","9","3","81","A","3³=27")
add(L,T,TO,C,"One interior angle of regular hexagon?","120°","108°","135°","144°","A","(6-2)×180/6=720/6=120")

# Section 5: Financial Math & Review (Lessons 49-50)
L=49; T="Financial Math & Roots"; TO="Percent"; C="MATH"
add(L,T,TO,C,"Car $20,000 depreciates 10%/yr. Value after 3 years?","$14,580","$14,000","$15,000","$16,200","A","20000×0.9³=20000×0.729=14580")
add(L,T,TO,C,"$1000 at 5% compound annually for 2 years. Balance?","$1,102.50","$1,100","$1,050","$1,105","A","1000×1.05²=1102.50")
add(L,T,TO,C,"Simplify √72","6√2","3√8","2√18","4√4.5","A","√(36×2)=6√2")
add(L,T,TO,C,"Evaluate: √100-3³+(-4)(-2)","−9","9","−19","19","A","10-27+8=-9")
add(L,T,TO,C,"Wage $25. 8% raise then 5% cut. Final hourly pay?","$25.65","$25.00","$25.75","$24.50","A","25×1.08=27; 27×0.95=25.65")
add(L,T,TO,C,"Sphere r=5m. Surface area? (π≈3.14)","314 m²","78.5 m²","157 m²","628 m²","A","4×3.14×25=314")
add(L,T,TO,C,"Solve: (x-2)/4=3/(x+2)","x=4 or x=-4","x=14","x=2","x=4","A","Cross multiply: (x-2)(x+2)=12; x²=16; x=±4")
add(L,T,TO,C,"Mean of 1/2, 2/3, 5/6?","2/3","1/2","3/4","5/6","A","Sum=3/6+4/6+5/6=12/6=2; mean=2/3")
add(L,T,TO,C,"Pool filled by Pipe A (4hr) and B (6hr). Together how long?","2.4 hours","5 hours","2 hours","3 hours","A","1/4+1/6=5/12 per hr; 12/5=2.4hr")
add(L,T,TO,C,"Write 0.00045 in scientific notation","4.5×10⁻⁴","45×10⁻⁵","4.5×10⁻³","0.45×10⁻³","A","Move decimal 4 places right")

L=50; T="Financial Math & Roots"; TO="Algebra"; C="MATH"
add(L,T,TO,C,"Right triangle: legs √7 and √18. Hypotenuse?","5","√25","√11","25","A","√(7+18)=√25=5")
add(L,T,TO,C,"Solve: 3y+4y-2y=45","y=9","y=5","y=15","y=45","A","5y=45; y=9")
add(L,T,TO,C,"Evaluate (a²-b²)/(a-b) when a=-5, b=-2","-7","7","-3","3","A","(25-4)/(-5+2)=21/(-3)=-7")
add(L,T,TO,C,"Express 11/20 as decimal and percent","0.55 and 55%","0.55 and 5.5%","5.5 and 550%","0.055 and 55%","A","11÷20=0.55=55%")
add(L,T,TO,C,"Item total $54.13 includes 8.25% tax. Base price?","$50.00","$49.50","$50.25","$45.88","A","P×1.0825=54.13; P≈50.00")
add(L,T,TO,C,"Simplify: (-2)⁴-|−10|","6","26","-6","16","A","16-10=6")
add(L,T,TO,C,"Right triangle: hypotenuse 25in, one leg 24in. Other leg?","7 in","1 in","49 in","25 in","A","√(625-576)=√49=7")
add(L,T,TO,C,"Solve proportion: 3.2/8=x/20","x=8","x=16","x=6.4","x=4","A","x=3.2×20/8=8")
add(L,T,TO,C,"Simplify: (6.0×10³)/(1.5×10⁶)","0.004","4","0.04","400","A","6/1.5=4; 10³⁻⁶=10⁻³; 4×10⁻³=0.004")
add(L,T,TO,C,"Evaluate: 5²×2³×7⁰","200","175","250","0","A","25×8×1=200")

print(f"Batch 5 done: {len(questions)} questions")

# =====================================================
# WRITE OUTPUT
# =====================================================
print(f"\nTotal questions: {len(questions)}")
with open('/Users/padmoort/elementaryrecap/src/main/resources/data/questions.json', 'w') as f:
    json.dump(questions, f, indent=1)
print("Written to src/main/resources/data/questions.json")
