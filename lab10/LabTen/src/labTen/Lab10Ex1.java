����   4 M  com/cg/lbd/ui/Lab6Ex5  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lcom/cg/lbd/ui/Lab6Ex5; getSecondSmallest ([I)I  java/util/ArrayList
  	
    java/lang/Integer   valueOf (I)Ljava/lang/Integer;    java/util/List   add (Ljava/lang/Object;)Z
   " ! java/util/Collections # $ sort (Ljava/util/List;)V  & ' ( get (I)Ljava/lang/Object;
  * + , intValue ()I arr [I List Ljava/util/List; i I LocalVariableTypeTable %Ljava/util/List<Ljava/lang/Integer;>; StackMapTable . main ([Ljava/lang/String;)V
  	
  ;  	 = ? > java/lang/System @ A out Ljava/io/PrintStream;
 C E D java/io/PrintStream F G println (I)V args [Ljava/lang/String; p 
SourceFile Lab6Ex5.java !               /     *� �    
                           �     B� Y� M+Y:�66� .>,� �  W����,� ,� % � � )�    
       	  
   & 
 0  4     *    B       B - .   : / 0    1 2  3      : / 4  5    �    6   6   	 7 8     �     c� Y� 9L�
Y+OY6OYAOYLOY OYLOYWOY+OYBOY	OY
 OY6OY+OM+,� :>� <� B�    
          U  [  b     *    c H I    [ J   U  - .  [  1 2   K    L