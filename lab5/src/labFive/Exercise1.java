����   ; Y  labThree/Exercise2  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LlabThree/Exercise2; getImage &(Ljava/lang/String;)Ljava/lang/String;  java/lang/StringBuffer
     (Ljava/lang/String;)V
     reverse ()Ljava/lang/StringBuffer;
     toString ()Ljava/lang/String; a Ljava/lang/String; sb Ljava/lang/StringBuffer; str main ([Ljava/lang/String;)V	 % ' & java/lang/System ( ) out Ljava/io/PrintStream; + Enter the word
 - / . java/io/PrintStream 0  println 2 java/util/Scanner	 % 4 5 6 in Ljava/io/InputStream;
 1 8  9 (Ljava/io/InputStream;)V
 1 ; <  next > java/lang/StringBuilder
 @ B A java/lang/String C D valueOf &(Ljava/lang/Object;)Ljava/lang/String;
 =  G |
 = I J K append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
  M  
 = 
 1 P Q  close args [Ljava/lang/String; sc Ljava/util/Scanner; b 
SourceFile Exercise2.java !               /     *� �    
                    	       _     � Y*� L+� W+� M,�    
        	     	              	        !   	 " #     �     ?� $*� ,� 1Y� 3� 7L+� :M,N� $� =Y-� ?� EF� H,� L� H� N� ,+� O�    
                :  >     *    ? R S    , T U   '     % V    W    X