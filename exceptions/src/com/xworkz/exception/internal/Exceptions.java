package com.xworkz.exception.internal;

import org.omg.CORBA.UserException;
import org.omg.CORBA.portable.ApplicationException;
import org.omg.CORBA.portable.RemarshalException;

import javax.lang.model.type.MirroredTypesException;
import javax.print.PrintException;
import javax.script.ScriptException;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.xml.crypto.KeySelectorException;
import javax.xml.crypto.NoSuchMechanismException;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.soap.SOAPException;
import javax.xml.transform.TransformerException;
import java.awt.*;
import java.awt.color.ProfileDataException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.image.ImagingOpException;
import java.awt.image.RasterFormatException;
import java.awt.print.PrinterException;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.invoke.LambdaConversionException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.MalformedParametersException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.channels.AlreadyBoundException;
import java.nio.file.ProviderNotFoundException;
import java.rmi.MarshalException;
import java.rmi.activation.ActivationException;
import java.rmi.server.ServerNotActiveException;
import java.security.ProviderException;
import java.security.acl.LastOwnerException;
import java.security.acl.NotOwnerException;
import java.sql.SQLException;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.TooManyListenersException;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.prefs.InvalidPreferencesFormatException;
import java.util.zip.DataFormatException;

public class Exceptions {
    public void arithmeticException()throws ArithmeticException{
        System.out.println("this is ArithmeticException");
        throw new ArithmeticException();
    }
    public void activationException() throws ActivationException{
        System.out.println("this is ActivationException");
        throw new ActivationException();
    }
    public void alreadyBoundException() throws AlreadyBoundException {
        System.out.println("this is AlreadyBoundException");
        throw new AlreadyBoundException();
    }
    public void applicationException() throws ApplicationException{
        System.out.println("this is ApplicationException");
        throw new ApplicationException();
    }
    public void marshalException() throws MarshalException{
        System.out.println("this is MarshalException");
        throw new MarshalException();
    }
    public void remarshalException() throws RemarshalException{
        System.out.println("this is RemarshalException");
        throw new RemarshalException();
    }
    public void transformerException() throws TransformerException{
        System.out.println("this is TransformerException");
        throw new TransformerException();
    }
    public void transformException() throws TransformException {
        System.out.println("this is TransformException");
        throw new TransformException();
    }
    public void sQLException() throws SQLException {
        System.out.println("this is SQLException");
        throw new SQLException();
    }
    public void sOAPException() throws SOAPException {
        System.out.println("this is SOAPException");
        throw new SOAPException();
    }
    public void userException() throws UserException {
        System.out.println("this is UserException");
        throw new UserException();
    }
    public void printerException() throws PrinterException {
        System.out.println("this is PrinterException");
        throw new PrinterException();
    }
    public void printException() throws PrintException{
        System.out.println("this is PrintException");
        throw new PrintException();
    }
    public void illegalClassFormatException() throws IllegalClassFormatException {
        System.out.println("this is IllegalClassFormatException");
        throw new IllegalClassFormatException();
    }
    public void keySelectorException() throws KeySelectorException {
        System.out.println("this is KeySelectorException");
        throw new KeySelectorException();
    }
    public void fontFormatException() throws FontFormatException {
        System.out.println("this is FontFormatException");
        throw new FontFormatException();
    }
    public void lambdaConversionException() throws LambdaConversionException{
        System.out.println("this is LambdaConversionException");
        throw new LambdaConversionException();
    }
    public void lastOwnerException() throws LastOwnerException {
        System.out.println("this is LastOwnerException");
        throw new LastOwnerException();
    }
    public void notOwnerException() throws NotOwnerException{
        System.out.println("this is NotOwnerException");
        throw new NotOwnerException();
    }
    public void invalidPreferencesFormatException() throws InvalidPreferencesFormatException{
        System.out.println("this is InvalidPreferencesFormatException");
        throw new InvalidPreferencesFormatException();
    }
    public void lineUnavailableException() throws LineUnavailableException{
        System.out.println("this is LineUnavailableException");
        throw new LineUnavailableException();
    }
    public void TimeoutException() throws TimeoutException{
        System.out.println("this is TimeoutException");
        throw new TimeoutException();
    }
    public void KeySelectorException() throws KeySelectorException{
        System.out.println("this is KeySelectorException");
        throw new KeySelectorException();
    }
    public void serverNotActiveException() throws ServerNotActiveException{
        System.out.println("this is ServerNotActiveException");
        throw new ServerNotActiveException();
    }
    public void scriptException() throws ScriptException {
        System.out.println("this is ScriptException");
        throw new ScriptException();
    }
    public void tooManyListenersException() throws TooManyListenersException{
        System.out.println("this is TooManyListenersException");
        throw new TooManyListenersException();
    }
    public void brokenBarrierException() throws BrokenBarrierException {
        System.out.println("this is BrokenBarrierException");
        throw new BrokenBarrierException();
    }
    public void dataFormatException() throws DataFormatException {
        System.out.println("this is DataFormatException");
        throw new DataFormatException();
    }
    public void unsupportedAudioFileException() throws UnsupportedAudioFileException {
        System.out.println("this is UnsupportedAudioFileException");
        throw new UnsupportedAudioFileException();
    }
    public void unsupportedCallbackException() throws UnsupportedCallbackException {
        System.out.println("this is UnsupportedCallbackException");
        throw new UnsupportedCallbackException();
    }
    public void unsupportedFlavorException() throws UnsupportedFlavorException {
        System.out.println("this is UnsupportedFlavorException");
        throw new UnsupportedFlavorException();
    }
    public void unsupportedLookAndFeelException() throws UnsupportedLookAndFeelException {
        System.out.println("this is UnsupportedLookAndFeelException");
        throw new UnsupportedLookAndFeelException();
    }

    public void annotationTypeMismatchException() throws AnnotationTypeMismatchException {
        System.out.println("this is Runtime AnnotationTypeMismatchException");
        throw new AnnotationTypeMismatchException();
    }
    public void arrayStoreException() throws ArrayStoreException {
        System.out.println("this is ArrayStoreException");
        throw new ArrayStoreException();
    }
    public void bufferOverflowException() throws BufferOverflowException {
        System.out.println("this is BufferOverflowException");
        throw new BufferOverflowException();
    }
    public void bufferUnderflowException() throws BufferUnderflowException {
        System.out.println("this is BufferUnderflowException");
        throw new BufferUnderflowException();
    }
    public void CannotRedoException() throws CannotRedoException {
        System.out.println("this is CannotRedoException");
        throw new CannotRedoException();
    }
    public void CannotUndoException() throws CannotUndoException {
        System.out.println("this is CannotUndoException");
        throw new CannotUndoException();
    }
    public void classCastException() throws ClassCastException {
        System.out.println("this is ClassCastException");
        throw new ClassCastException();
    }
    public void IllegalArgumentException() throws IllegalArgumentException {
        System.out.println("this is IllegalArgumentException");
        throw new IllegalArgumentException();
    }
    public void IllegalStateException() throws IllegalStateException {
        System.out.println("this is IllegalStateException");
        throw new IllegalStateException();
    }
    public void ImagingOpException() throws ImagingOpException {
        System.out.println("this is ImagingOpException");
        throw new ImagingOpException();
    }
    public void IncompleteAnnotationException() throws IncompleteAnnotationException {
        System.out.println("this is Runtime IncompleteAnnotationException");
        throw new IncompleteAnnotationException();
    }
    public void IndexOutOfBoundsException() throws IndexOutOfBoundsException {
        System.out.println("this is Runtime IndexOutOfBoundsException");
        throw new IndexOutOfBoundsException();
    }
    public void MalformedParameterizedTypeException() throws MalformedParameterizedTypeException {
        System.out.println("this is Runtime MalformedParameterizedTypeException");
        throw new MalformedParameterizedTypeException();
    }
    public void MalformedParametersException() throws MalformedParametersException {
        System.out.println("this is Runtime MalformedParametersException");
        throw new MalformedParametersException();
    }
    public void MirroredTypesException() throws MirroredTypesException {
        System.out.println("this is Runtime MirroredTypesException");
        throw new MirroredTypesException();
    }
    public void MissingResourceException() throws MissingResourceException {
        System.out.println("this is Runtime MissingResourceException");
        throw new MissingResourceException();
    }
    public void NoSuchElementException() throws NoSuchElementException {
        System.out.println("this is Runtime NoSuchElementException");
        throw new NoSuchElementException();
    }
    public void NoSuchMechanismException() throws NoSuchMechanismException {
        System.out.println("this is Runtime NoSuchMechanismException");
        throw new NoSuchMechanismException();
    }
    public void NullPointerException() throws NullPointerException {
        System.out.println("this is Runtime NullPointerException");
        throw new NullPointerException();
    }
    public void ProfileDataException() throws ProfileDataException {
        System.out.println("this is Runtime ProfileDataException");
        throw new ProfileDataException();
    }
    public void ProviderException() throws ProviderException {
        System.out.println("this is Runtime ProviderException");
        throw new ProviderException();
    }
    public void ProviderNotFoundException() throws ProviderNotFoundException {
        System.out.println("this is Runtime ProviderNotFoundException");
        throw new ProviderNotFoundException();
    }
    public void RasterFormatException() throws RasterFormatException {
        System.out.println("this is Runtime RasterFormatException");
        throw new RasterFormatException();
    }
    public void RejectedExecutionException() throws RejectedExecutionException {
        System.out.println("this is Runtime RejectedExecutionException");
        throw new RejectedExecutionException();
    }
    public void SecurityException() throws SecurityException {
        System.out.println("this is Runtime SecurityException");
        throw new SecurityException();
    }


}
