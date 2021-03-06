/*
 * IzPack - Copyright 2001-2012 Julien Ponge, All Rights Reserved.
 *
 * http://izpack.org/
 * http://izpack.codehaus.org/
 *
 * Copyright 2012 Tim Anderson
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.izforge.izpack.event;

import java.io.File;
import java.util.List;

import com.izforge.izpack.api.data.AutomatedInstallData;
import com.izforge.izpack.api.data.InstallData;
import com.izforge.izpack.api.data.Pack;
import com.izforge.izpack.api.data.PackFile;
import com.izforge.izpack.api.event.InstallerListener;
import com.izforge.izpack.api.event.ProgressListener;
import com.izforge.izpack.api.event.ProgressNotifiers;
import com.izforge.izpack.api.exception.IzPackException;
import com.izforge.izpack.api.handler.AbstractUIProgressHandler;


/**
 * Abstract implementation of {@link InstallerListener}.
 * <p/>
 * This provides no-op versions of each of the methods, to simplify implementation of listeners that only need
 * some methods.
 *
 * @author Tim Anderson
 */
public abstract class AbstractInstallerListener implements InstallerListener
{

    /**
     * The installation data.
     */
    private final InstallData installData;

    /**
     * The notifiers. May be {@code null}.
     */
    private final ProgressNotifiers notifiers;


    /**
     * Constructs an {@code AbstractInstallerListener}.
     *
     * @param installData the installation data
     */
    public AbstractInstallerListener(InstallData installData)
    {
        this(installData, null);
    }


    /**
     * Constructs an {@code AbstractInstallerListener}.
     *
     * @param installData the installation data
     * @param notifiers   the progress notifiers. May be {@code null}
     */
    public AbstractInstallerListener(InstallData installData, ProgressNotifiers notifiers)
    {
        this.installData = installData;
        this.notifiers = notifiers;
    }

    /**
     * Initialises the listener.
     *
     * @throws IzPackException for any error
     */
    @Override
    public void initialise()
    {
    }

    /**
     * Invoked before packs are installed.
     *
     * @param packs the packs to be installed
     * @throws IzPackException for any error
     */
    @Override
    public void beforePacks(List<Pack> packs)
    {
    }

    /**
     * Invoked before a pack is installed.
     *
     * @param pack  the pack
     * @param index the pack number
     * @throws IzPackException for any error
     */
    @Override
    public void beforePack(Pack pack, int index)
    {
    }

    /**
     * Invoked after a pack is installed.
     *
     * @param pack  the pack
     * @param index the pack number
     * @throws IzPackException for any error
     */
    @Override
    public void afterPack(Pack pack, int index)
    {
    }

    /**
     * Invoked after packs are installed.
     *
     * @param packs    the installed packs
     * @param listener the progress listener
     * @throws IzPackException for any error
     */
    @Override
    public void afterPacks(List<Pack> packs, ProgressListener listener)
    {
    }

    /**
     * Invoked before a directory is created.
     *
     * @param dir      the directory
     * @param packFile the corresponding pack file
     * @param pack     the pack that {@code packFile} comes from
     * @throws IzPackException for any error
     */
    @Override
    public void beforeDir(File dir, PackFile packFile, Pack pack)
    {
    }

    /**
     * Invoked after a directory is created.
     *
     * @param dir      the directory
     * @param packFile the corresponding pack file
     * @param pack     the pack that {@code packFile} comes from
     * @throws IzPackException for any error
     */
    @Override
    public void afterDir(File dir, PackFile packFile, Pack pack)
    {
    }

    /**
     * Invoked before a file is installed.
     *
     * @param file     the file
     * @param packFile the corresponding pack file
     * @param pack     the pack that {@code packFile} comes from
     * @throws IzPackException for any error
     */
    @Override
    public void beforeFile(File file, PackFile packFile, Pack pack)
    {
    }

    /**
     * Invoked after a file is installed.
     *
     * @param file     the file
     * @param packFile the corresponding pack file
     * @param pack     the pack that {@code packFile} comes from
     * @throws IzPackException for any error
     */
    @Override
    public void afterFile(File file, PackFile packFile, Pack pack)
    {
    }

    /**
     * Invoked when the installer creates the listener instance, immediately after the install data is parsed.
     *
     * @param data the installation data
     * @throws Exception for any error
     */
    @Override
    public void afterInstallerInitialization(AutomatedInstallData data) throws Exception
    {
    }

    /**
     * Invoked before packs are installed.
     *
     * @param data    the installation data
     * @param packs   the number of packs which are defined for this installation
     * @param handler the UI progress handler
     * @throws Exception for any error
     */
    @Override
    public void beforePacks(AutomatedInstallData data, Integer packs, AbstractUIProgressHandler handler)
            throws Exception
    {
    }

    /**
     * Invoked before a pack is installed.
     *
     * @param pack    the pack
     * @param i       the pack number
     * @param handler the UI progress handler
     * @throws Exception for any error
     */
    @Override
    public void beforePack(Pack pack, Integer i, AbstractUIProgressHandler handler) throws Exception
    {
    }

    /**
     * Determines if the listener should be notified of every file and directory installation.
     *
     * @return <tt>false</tt>
     */
    @Override
    public boolean isFileListener()
    {
        return false;
    }

    /**
     * Invoked before a directory is created.
     *
     * @param dir      the directory
     * @param packFile the corresponding pack file
     * @throws Exception for any error
     */
    @Override
    public void beforeDir(File dir, PackFile packFile) throws Exception
    {
    }

    /**
     * Invoked after a directory is created.
     *
     * @param dir      the directory
     * @param packFile the corresponding pack file
     * @throws Exception for any error
     */
    @Override
    public void afterDir(File dir, PackFile packFile) throws Exception
    {
    }

    /**
     * Invoked before a file is installed.
     *
     * @param file     the file
     * @param packFile the corresponding pack file
     * @throws Exception if the listener throws an exception
     */
    @Override
    public void beforeFile(File file, PackFile packFile) throws Exception
    {
    }

    /**
     * Invoked after a file is installed.
     *
     * @param file     the file
     * @param packFile the corresponding pack file
     * @throws Exception for any error
     */
    @Override
    public void afterFile(File file, PackFile packFile) throws Exception
    {
    }

    /**
     * Invoked after a pack is installed.
     *
     * @param pack    the pack
     * @param i       the pack number
     * @param handler the UI progress handler
     * @throws Exception for any error
     */
    @Override
    public void afterPack(Pack pack, Integer i, AbstractUIProgressHandler handler) throws Exception
    {
    }

    /**
     * Invoked after packs are installed.
     *
     * @param data    the installation data
     * @param handler the UI progress handler
     * @throws Exception for any error
     */
    @Override
    public void afterPacks(AutomatedInstallData data, AbstractUIProgressHandler handler) throws Exception
    {
    }

    /**
     * Determines if listeners should notify a {@link ProgressListener}.
     *
     * @return {@code true} if the {@link ProgressListener} should be notified
     */
    protected boolean notifyProgress()
    {
        return (notifiers != null && notifiers.notifyProgress());
    }

    /**
     * Returns the progress notifier id of this listener.
     *
     * @return the progress notifier id of this listener, or {@code 0} if this is not registered
     */
    protected int getProgressNotifierId()
    {
        return notifiers != null ? notifiers.indexOf(this) + 1 : 0;
    }

    /**
     * Register this listener as a progress notifier.
     */
    protected void setProgressNotifier()
    {
        if (notifiers != null)
        {
            notifiers.addNotifier(this);
        }
    }

    /**
     * Returns the progress notifiers.
     *
     * @return the progress notifiers, or {@code null} if none was supplied at construction
     */
    protected ProgressNotifiers getProgressNotifiers()
    {
        return notifiers;
    }

    /**
     * Returns the installation data.
     *
     * @return the installation data
     */
    protected InstallData getInstallData()
    {
        return installData;
    }

    /**
     * Helper to return a localised message, given its identifier.
     *
     * @param id the message identifier
     * @return the corresponding message, or {@code id} if it doesn't exist
     */
    protected String getMessage(String id)
    {
        return installData.getMessages().get(id);
    }

}
