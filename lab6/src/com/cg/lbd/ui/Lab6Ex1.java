����   ; R  labFive/Exercise2  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LlabFive/Exercise2; main ([Ljava/lang/String;)V  java/lang/String
  	  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     ! out Ljava/io/PrintStream; # enter first name :
 % ' & java/io/PrintStream ( ) println (Ljava/lang/String;)V
  + , - nextLine ()Ljava/lang/String; / enter last name :
  1 2  close
  4 5 6 isBlank ()Z 8 labFive/NameException : First Name cannot be blank
 7 <  ) > First Name is valid @ Last Name cannot be blank B Last Name is valid
 % D ( E (Ljava/lang/Object;)V args [Ljava/lang/String; 	firstName Ljava/lang/String; lastName sc Ljava/util/Scanner; e LlabFive/NameException; StackMapTable 
SourceFile Exercise2.java !               /     *� �    
       
             	      1     y� Y� L� Y� M� Y� � N� "� $-� *L� .� $-� *M-� 0+� 3� � 7Y9� ;�� =� $,� 3� � 7Y?� ;�� A� $� :� � C�  9 k n 7  
   J           #  (  0  5  9  @  J  R  Y  c   k ! n # p % x (    4    y F G    q H I   i J I   ^ K L  p  M N  O    � J   J 7	  P    Q