����   ; _  labThree/Exercise1  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LlabThree/Exercise1; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V
     nextLine ()Ljava/lang/String;   java/util/StringTokenizer "  
  $  % '(Ljava/lang/String;Ljava/lang/String;)V
  ' (  	nextToken
 * , + java/lang/Integer - . parseInt (Ljava/lang/String;)I
  0 1 2 hasMoreElements ()Z	  4 5 6 out Ljava/io/PrintStream; 8 java/lang/StringBuilder : Sum: 
 7 <  = (Ljava/lang/String;)V
 7 ? @ A append (I)Ljava/lang/StringBuilder;
 7 C D  toString
 F H G java/io/PrintStream I = println
  K L  close args [Ljava/lang/String; n I sum sc Ljava/util/Scanner; str Ljava/lang/String; strt Ljava/util/StringTokenizer; next StackMapTable N \ java/lang/String 
SourceFile Exercise1.java !               /     *� �    
                    	           W=� Y� � N-� :� Y!� #:� � &:� )<`=� /��� 3� 7Y9� ;� >� B� E-� J�    
   2      	  
      #  *  0  4  <  R  V     H    W M N   0  O P   U Q P   J R S   D T U    7 V W  * 
 X U  Y    � #  Z   [     ]    ^