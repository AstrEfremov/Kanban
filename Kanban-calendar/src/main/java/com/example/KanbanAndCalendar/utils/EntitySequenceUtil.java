package com.example.KanbanAndCalendar.utils;

import com.example.KanbanAndCalendar.models.kanban.KanColumn;

import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class EntitySequenceUtil {
    /*public static void init(String sequence, List list){
        StringTokenizer tokenizer = new StringTokenizer(sequence, ";");

        while (tokenizer.hasMoreElements()) {
            Long id = Long.parseLong(tokenizer.nextToken());
            KanColumn current = list.stream().filter(f->f.getId()==id).findFirst().get();
            list.remove(current);
            list.add(current);
        }
    }

    public static void addColumnIntoEnd(KanColumn column){
        LinkedList<Long> list = sequenceToList();
        list.add(column.getId());
        columns.add(column);
        setSequence(toSequence(list));
    }

    public static void deleteColumnByPos(int pos){
        LinkedList<Long> list = sequenceToList();
        long id = list.remove(pos);
        setSequence(toSequence(list));
        columns.remove(pos);
    }

    public static void moveColumn(int element, int position){
        LinkedList<Long> list = sequenceToList();
        Long current = list.remove(element);
        list.add(position, current);
        setSequence(toSequence(list));
        KanColumn column = columns.remove(element);
        columns.add(position, column);
    }

    private static LinkedList<Long> sequenceToList(){
        StringTokenizer tokenizer = new StringTokenizer(sequence, ";");

        LinkedList<Long> list = new LinkedList<>();

        while (tokenizer.hasMoreElements()) {
            list.add(Long.parseLong(tokenizer.nextToken()));
        }

        return list;
    }

    private static String toSequence(LinkedList<Long> list){
        return String.join(";", list.stream().map(f->f.toString()).collect(Collectors.toList()));
    }*/
}
