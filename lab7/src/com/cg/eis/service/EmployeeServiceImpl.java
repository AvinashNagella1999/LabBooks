����   ; R  labOne/Fibonacci  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LlabOne/Fibonacci; fibRecursive (I)I
     n I StackMapTable fibNonRecursive first second next i main ([Ljava/lang/String;)V	    java/lang/System   ! out Ljava/io/PrintStream; # Enter a Number:
 % ' & java/io/PrintStream ( ) println (Ljava/lang/String;)V + java/util/Scanner	  - . / in Ljava/io/InputStream;
 * 1  2 (Ljava/io/InputStream;)V
 * 4 5 6 nextInt ()I
 * 8 9  close ; java/lang/StringBuilder = Using Recursive Function:
 : ?  )
 : A B C append (I)Ljava/lang/StringBuilder;
 : E F G toString ()Ljava/lang/String; I Using Non-Recursive Function:
  K   args [Ljava/lang/String; sc Ljava/util/Scanner; 
SourceFile Fibonacci.java !               /     *� �    
                    	       P     � �d� d� `�    
                             	       �     <=6� `><=�����    
          
             4                                 � 
    
 	       �     O� "� $� *Y� ,� 0M,� 3<,� 7� � :Y<� >� � @� D� $� � :YH� >� J� @� D� $�    
                5  N          O L M    7     < N O   P    Q