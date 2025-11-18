package com.xworkz.exception.external;

import com.xworkz.exception.internal.Exceptions;
import org.omg.CORBA.UserException;
import org.omg.CORBA.portable.ApplicationException;
import org.omg.CORBA.portable.RemarshalException;

import javax.print.PrintException;
import javax.script.ScriptException;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import javax.xml.crypto.KeySelectorException;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.soap.SOAPException;
import javax.xml.transform.TransformerException;
import java.awt.*;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.print.PrinterException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.invoke.LambdaConversionException;
import java.nio.channels.AlreadyBoundException;
import java.rmi.MarshalException;
import java.rmi.activation.ActivationException;
import java.rmi.server.ServerNotActiveException;
import java.security.acl.LastOwnerException;
import java.security.acl.NotOwnerException;
import java.sql.SQLException;
import java.util.TooManyListenersException;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.TimeoutException;
import java.util.prefs.InvalidPreferencesFormatException;
import java.util.zip.DataFormatException;

public class ExceptionRunner {
    public static  void main(String[] args)throws ArithmeticException, ActivationException, AlreadyBoundException, ApplicationException, MarshalException,
            RemarshalException, TransformerException, TransformException, SQLException, SOAPException, UserException, PrinterException,
            PrintException, IllegalClassFormatException , KeySelectorException, FontFormatException, LambdaConversionException,
            LastOwnerException, NotOwnerException, InvalidPreferencesFormatException, LineUnavailableException, TimeoutException,
            KeySelectorException, ServerNotActiveException, ScriptException, TooManyListenersException, BrokenBarrierException,
            DataFormatException, UnsupportedAudioFileException, UnsupportedCallbackException, UnsupportedFlavorException,
            UnsupportedLookAndFeelException {
        Exceptions exc = new Exceptions();
        exc.arithmeticException();
        exc.activationException();
        exc.applicationException();
        exc.alreadyBoundException();
        exc.marshalException();
        exc.remarshalException();
        exc.transformerException();
        exc.transformException();
        exc.sQLException();
        exc.sOAPException();
        exc.userException();
        exc.printerException();
        exc.printException();
        exc.keySelectorException();
        exc.fontFormatException();
        exc.lambdaConversionException();
        exc.lastOwnerException();
        exc.notOwnerException();
        exc.invalidPreferencesFormatException();
        exc.TimeoutException();
        exc.KeySelectorException();
        exc.serverNotActiveException();
        exc.scriptException();
        exc.tooManyListenersException();
        exc.brokenBarrierException();
        exc.dataFormatException();
        exc.unsupportedAudioFileException();
        exc.unsupportedCallbackException();
        exc.unsupportedFlavorException();
        exc.unsupportedLookAndFeelException();
        exc.annotationTypeMismatchException();
        exc.arrayStoreException();
        exc.bufferOverflowException();
        exc.bufferUnderflowException();
        exc.CannotRedoException();
        exc.CannotUndoException();
        exc.classCastException();
        exc.IllegalArgumentException();
        exc.IllegalStateException();
        exc.ImagingOpException();
        exc.IncompleteAnnotationException();
        exc.IndexOutOfBoundsException();
        exc.MalformedParameterizedTypeException();
        exc.MalformedParametersException();
        exc.MirroredTypesException();
        exc.MissingResourceException();
        exc.NoSuchElementException();
        exc.NoSuchMechanismException();
        exc.NullPointerException();
        exc.ProfileDataException();
        exc.ProviderException();
        exc.ProviderNotFoundException();
        exc.RasterFormatException();
        exc.RejectedExecutionException();
        exc.SecurityException();
    }
}