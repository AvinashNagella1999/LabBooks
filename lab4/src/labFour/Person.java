����   ; T  com/cg/eis/pl/EmployeeMain  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lcom/cg/eis/pl/EmployeeMain; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   Please enter Employee Id
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * nextLine ()Ljava/lang/String; , Please enter Employee Name . !Please enter Employee Designation 0 Please enter Employee Salary
  2 3 4 
nextDouble ()D
  6 7  close 9 com/cg/eis/service/Service
 8 	
 8 < = > input :(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)V
 8 @ A  display
 8 C D E 	insurance (D)V args [Ljava/lang/String; sc Ljava/util/Scanner; eid Ljava/lang/String; ename edesig esal D s Lcom/cg/eis/service/Service; 
SourceFile EmployeeMain.java !               /     *� �    
                    	           f� Y� � L� � !+� 'M� +� !+� 'N� -� !+� ':� /� !+� 19+� 5� 8Y� ::,-� ;� ?� B�    
   >        	  
    %  -  3  ;  A  E  N  Y  ^  e     H    f F G    [ H I   N J K  % A L K  3 3 M K  A % N O  N  P Q   R    S