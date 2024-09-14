import java.lang.*;

import javax.swing.plaf.basic.BasicTreeUI.TreeSelectionHandler;
public class Scoreboard{
    public class GameEntry<Integer>{
        private class Node<Integer>{
            private int element;
            private Node<Integer> prev;
            private Node<Integer> next;
            public Node(Integer e,Node<Integer> p,Node<Integer> n){
                element = e;
                prev = p;
                next = n;
            }
            public Integer getElement(){return element;}
            public Node<Integer> getPrev(){return prev;}
            public Node<Integer> getNext(){return next;}
            public void setPrev(Node<Integer> p){prev=p;}
            public void setNext(Node<Integer> n){next=n;}
        }
        private Node<Integer> header;
        private Node<Integer> trailer;
        private int size=0;
        public GameEntry(){
            header = new Node<>(0,null,null);
            trailer = new Node<>(0,header,null);
            header.setNext(trailer);
        }
        private void addBetween(Integer e,Node<Integer> predecessor,Node<Integer> successor){
            Node<Integer> newest = new Node<>(e,predecessor,successor);
            predecessor.setNext(newest);
            successor.setPrev(newest);
            size++;
        }
        public void addLast(Integer e){
            addBetween(e,trailer.getPrev(),trailer);
        }
        private Integer remove(Node<Integer> node){
            Node<Integer> predecessor = node.getPrev();
            Node<Integer> successor = node.getNext();
            predecessor.setNext(successor);
            successor.setPrev(predecessor);
            size--;
        }
        public void adANDset(int k){
            Node<Integer> p = trailer;
            Node<Integer> q = p.getPrev();
            if (size<10){
                while(Integer.parseInt(p.getElement())<k){
                    p=q;
                    q=q.getPrev();
                }
                Integer.addBetween(k,p,p.getPrev());
                 size++;
            }
            else{
                while(Integer.parseInt(p.getElement())<k){
                    p=q;
                    q=q.getPrev();
                }
                Integer.addBetween(k,p,p.getPrev());
                Integer.remove(trailer);
            }

        }
    }
    public static void main(String[] args){
        GameEntry dlist=new GameEntry();
        for (k=0;k<10;k++){
            dlist.adANDset(k);
        }
        dlist.adANDset(15);
        dlist.adANDset(3);
        dlist.adANDset(100);
        dlist.adANDset(4);
        System.out.println(dlist);
        }
    }